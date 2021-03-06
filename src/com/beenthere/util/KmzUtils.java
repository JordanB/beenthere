package com.beenthere.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.xmlpull.v1.XmlPullParserException;

import android.graphics.Bitmap;

import com.beenthere.kml.Configuration;
import com.beenthere.kml.Folder;
import com.beenthere.kml.KMLParser;
import com.beenthere.kml.Kml;
import com.beenthere.kml.LongDate;
import com.beenthere.kml.Placemark;
import com.beenthere.kml.Point;
import com.beenthere.kml.TimeStamp;
import com.beenthere.provider.Picture;

public class KmzUtils {
	
	
	private static final String	KML_FILE_NAME	= "Album.kml";
	
	private static final String	IMG_TAG 		= "<img src=\"";
	private static final String	END_IMG_TAG		= "\" />";
	private static final String TXT_TAG			= "<p>";
	private static final String END_TXT_TAG		= "</p>";
	private static final String	CDATA_START 	= "<![CDATA[";
	private static final String CDATA_END 		= "]]>";
	
	public static Kml create(File albumFile, String albumName) {
		if (!albumFile.exists()) {
			albumFile.mkdirs();
		}
		Kml kml = new Kml();
		Folder root = new Folder();
		root.setName(albumName);
		kml.addFolder(root);
		return kml;
	}
	
	public static void writeKml(File albumFile, Kml kml) throws IOException {
		final File kmlFile = new File(albumFile, KML_FILE_NAME);
		if (!kmlFile.exists()) {
			kmlFile.createNewFile();
		}
		FileUtils.writeText(kml.toKML(), kmlFile);
	}
	
	public static KmzParseResult parse(File albumFile) {
		final KmzParseResult result = new KmzParseResult();
		result.isValid = false;
		
		final File kmlFile = new File(albumFile, KML_FILE_NAME);
		if (kmlFile == null || !kmlFile.exists()) {
			return result;
		}

		try {
			/**
		     * You probably don't want IDs auto-generated when you're loading
		     * a document. You can always turn it back on later.
		     * NOTE: KML updates will only work for objects that have
		     * an ID (either autogenerated or assigned).
		     */
			Configuration.properties.setProperty(Configuration.GENERATE_IDS, Configuration.OFF);
		    final Kml kml = KMLParser.parse(kmlFile);
		    
		    final String albumAbsPath = albumFile.getAbsolutePath();
		    final long albumId = Long.valueOf(albumFile.getName());
		    
		    // Get folder
		    Folder albumFolder = kml.getFolder();
		    if (albumFolder != null) {
		    	
		    	// Get name
		    	result.albumName = albumFolder.getName();
		    	result.isValid = true;
		    	
		    	// Iterate placemarks
		    	result.pictures = new ArrayList();
		    	Placemark[] placemarks = albumFolder.getPlacemarks();
			    for (int i = 0; i < placemarks.length; ++i) {
			    	Placemark placemark = placemarks[i];
			    	
			    	// Get image path and text from description
			    	String[] imageAndText = toImageAndText(placemark.getDescription());
			    	if (imageAndText[0] != null) {
			    		
			    		// Without an image, it is not interesting
			    		String pictureRelPath = imageAndText[0];
			    		
			    		// Make sure the resource file is present
		    			if (new File(albumFile, pictureRelPath).exists()) {
		    				
		    				// Get point for coordinates
		    				Point point = placemark.getPoint();
		    				if (point != null) {
		    					
		    					// Get coordinates
		    					double[] latLon  = toLatLon(point.getCoordinates());
		    					double latitude  = latLon[0];
		    					double longitude = latLon[1];
		    					if (latitude != Constants.NO_GEO_TAG && longitude != Constants.NO_GEO_TAG) {
		    						
		    						// Without coordinates, it is not interesting
		    						
		    						// Get time
		    						long date = toTime(placemark.getTimeStamp());
		    						
		    						// Get description
		    						String description = imageAndText[1];
		    						if (description == null) {
		    							description = "";
		    						}
		    						
		    						final String nameId = pictureRelPath.toLowerCase().replaceAll(Constants.JPG, "");
		    						final Picture picture = new Picture(Long.valueOf(nameId), true, latitude, longitude, date);
		    						picture.setMiniPath(albumAbsPath + "/" + pictureRelPath);
		    						picture.setGroupId(albumId);
		    						picture.setDescription(description);
				    				result.pictures.add(picture);
		    					}
		    				}
		    			}
		    		}
			    }
		    }		    
		} 
		catch (IOException e) {
			result.isValid = false;
		} 
		catch (XmlPullParserException e) {
		    result.isValid = false;
		}
		return result;
	}
	
	/**
	 * Create a placemark containing the information of the picture.
	 * If the picture file does not already exist, copy it from the
	 * original picture, and update the picture's data members.
	 * @param albumFile
	 * @param picture
	 * @return the new placemark
	 */
	public static Placemark createPlacemark(File albumFile, Picture picture, ThumbManager thumbManager) {
		Placemark placemark = null;
		boolean fileExists = true;
		long imageId = picture.getId();
		if (!new File(albumFile, imageId + Constants.JPG).exists()) {
			// The image does not already exist in the album,
			// so retrieve it, and copy it.
			fileExists = false;
			File srcFile = null;
			// 1. Try to retrieve it from its mini path.
			String miniPath = picture.getMiniPath();
			if (miniPath != null) {
				final File thumbFile = new File(miniPath);
				if (thumbFile.exists()) {
					srcFile = thumbFile;
					fileExists = true;
				}
			}
			// 2. Try to retrieve it from the ThumbManager
			if (!fileExists) {
				Bitmap bitmap = thumbManager.getMiniBitmap(picture);
				if (bitmap != null) {
					miniPath = picture.getMiniPath();
					final File thumbFile = new File(miniPath);
					if (thumbFile.exists()) {
						srcFile = thumbFile;
						fileExists = true;
					}
					bitmap.recycle();
					bitmap = null;
				}
			}
			if (srcFile != null && fileExists) {
				imageId = FileUtils.generateId();
				final File dstFile = new File(albumFile, imageId + Constants.JPG);
				try {
					FileUtils.copy(srcFile, dstFile);
					// Update picture instance with new values
					picture.setLocal(true);
					picture.setId(imageId);
					picture.setFullPath(null);
					picture.setMiniPath(dstFile.getAbsolutePath());
					picture.setMicroPath(null);
				} catch (IOException e) {
					fileExists = false;
				}
			}
		} 
		
		if (fileExists) {
			// Set group id on picture
			if (albumFile != null) {
				picture.setGroupId(Long.valueOf(albumFile.getName()));
			}
			
			// Create Placemark
			placemark = new Placemark();
			final String path = String.valueOf(imageId) + Constants.JPG;
			placemark.setName(path);
			placemark.setDescription(toHTML(path, picture.getDescription()));
			placemark.addTimeStamp(toTimeStamp(picture.getDate()));
			
			// - Add Point
			final Point point = new Point();
			point.setCoordinates(toCoordinates(picture.getLatitude(), picture.getLongitude()));
			placemark.addPoint(point);		
		}
		return placemark;
	}
	
	private static String toHTML(String imgPath, String text) {
		String html = "";
		html += CDATA_START;
		html += IMG_TAG + imgPath + END_IMG_TAG;
		html += TXT_TAG + text + END_TXT_TAG;
		html += CDATA_END;
		return html;
	}
	
	private static String[] toImageAndText(String description) {
		String[] imageAndText = new String[2];
		// Parse image path
		int imgPathStart 	= description.indexOf(IMG_TAG);
		imgPathStart 		+= IMG_TAG.length();
		int imgPathEnd 		= description.indexOf(END_IMG_TAG, imgPathStart);
		if (imgPathStart > 0 && imgPathEnd > imgPathStart) {
			imageAndText[0] = description.substring(imgPathStart, imgPathEnd);
		}
		// Parse text
		int txtStart	 	= description.indexOf(TXT_TAG, imgPathEnd);
		txtStart	 		+= TXT_TAG.length();
		int txtEnd	 		= description.indexOf(END_TXT_TAG, txtStart);
		if (txtStart > 0 && txtEnd > txtStart) {
			imageAndText[1] = description.substring(txtStart, txtEnd);
		}
		return imageAndText;
	}
	
	private static double[] toLatLon(String coordinates) {
		double[] latLon = new double[2];
		latLon[0] = Constants.NO_GEO_TAG;
		latLon[1] = Constants.NO_GEO_TAG;
		String[] coords = coordinates.split(",");
		if (coords.length == 2 || coords.length == 3) {
			latLon[0] = Double.valueOf(coords[1]);
			latLon[1] = Double.valueOf(coords[0]);
		}
		return latLon;
	}
	
	private static String toCoordinates(double latitude, double longitude) {
		String coords = "";
		coords += Double.toString(longitude) + ",";
		coords += Double.toString(latitude) + ",";
		coords += "0";
		return coords;
	}
	
	private static long toTime(TimeStamp timestamp) {
		long time = Constants.NO_DATE;
		if (timestamp != null) {
			final LongDate longdate = timestamp.getWhen();
			if (longdate != null) {
				final Date date = longdate.getDate();
				if (date != null) {
					time = date.getTime();
				}
			}
		}
		return time;
	}
	
	private static TimeStamp toTimeStamp(long dateInMs) {
		final TimeStamp timestamp = new TimeStamp();
		if (dateInMs != Constants.NO_DATE) {
			final Date date = new Date(dateInMs);
			timestamp.setWhen(new LongDate(date));
		}
		return timestamp;
	}
	
	public static class KmzParseResult {
		public boolean isValid;
		public ArrayList pictures;
		public String albumName;
	}
}
