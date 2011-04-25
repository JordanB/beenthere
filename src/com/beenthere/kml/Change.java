package com.beenthere.kml;
/**
 * AutoGenerated.
 *
 */

public class Change extends Node
{
    protected ObjectNode objectNode;
    protected Feature feature;
    protected Geometry geometry;
    protected StyleSelector styleSelector;
    protected TimePrimitive timePrimitive;


    public Change()
    {
        super();
    }

    public Change(Node parent)
    {
        super(parent);
    }

    public ObjectNode getObjectNode()
    {
        return this.objectNode;
    }

    public void addObjectNode(ObjectNode value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Lod getLod()
    {
        if(this.objectNode instanceof Lod)
        {
            return (Lod)this.objectNode;
        }
        return null;
    }

    public void addLod(Lod value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Region getRegion()
    {
        if(this.objectNode instanceof Region)
        {
            return (Region)this.objectNode;
        }
        return null;
    }

    public void addRegion(Region value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Link getLink()
    {
        if(this.objectNode instanceof Link)
        {
            return (Link)this.objectNode;
        }
        return null;
    }

    public void addLink(Link value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Document getDocument()
    {
        if(this.objectNode instanceof Document)
        {
            return (Document)this.objectNode;
        }
        return null;
    }

    public void addDocument(Document value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Folder getFolder()
    {
        if(this.objectNode instanceof Folder)
        {
            return (Folder)this.objectNode;
        }
        return null;
    }

    public void addFolder(Folder value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public NetworkLink getNetworkLink()
    {
        if(this.objectNode instanceof NetworkLink)
        {
            return (NetworkLink)this.objectNode;
        }
        return null;
    }

    public void addNetworkLink(NetworkLink value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public GroundOverlay getGroundOverlay()
    {
        if(this.objectNode instanceof GroundOverlay)
        {
            return (GroundOverlay)this.objectNode;
        }
        return null;
    }

    public void addGroundOverlay(GroundOverlay value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public ScreenOverlay getScreenOverlay()
    {
        if(this.objectNode instanceof ScreenOverlay)
        {
            return (ScreenOverlay)this.objectNode;
        }
        return null;
    }

    public void addScreenOverlay(ScreenOverlay value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Placemark getPlacemark()
    {
        if(this.objectNode instanceof Placemark)
        {
            return (Placemark)this.objectNode;
        }
        return null;
    }

    public void addPlacemark(Placemark value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public ItemIcon getItemIcon()
    {
        if(this.objectNode instanceof ItemIcon)
        {
            return (ItemIcon)this.objectNode;
        }
        return null;
    }

    public void addItemIcon(ItemIcon value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Scale getScale()
    {
        if(this.objectNode instanceof Scale)
        {
            return (Scale)this.objectNode;
        }
        return null;
    }

    public void addScale(Scale value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public IconStyleIcon getIconStyleIcon()
    {
        if(this.objectNode instanceof IconStyleIcon)
        {
            return (IconStyleIcon)this.objectNode;
        }
        return null;
    }

    public void addIconStyleIcon(IconStyleIcon value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LatLonBox getLatLonBox()
    {
        if(this.objectNode instanceof LatLonBox)
        {
            return (LatLonBox)this.objectNode;
        }
        return null;
    }

    public void addLatLonBox(LatLonBox value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public TimeStamp getTimeStamp()
    {
        if(this.objectNode instanceof TimeStamp)
        {
            return (TimeStamp)this.objectNode;
        }
        return null;
    }

    public void addTimeStamp(TimeStamp value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public TimeSpan getTimeSpan()
    {
        if(this.objectNode instanceof TimeSpan)
        {
            return (TimeSpan)this.objectNode;
        }
        return null;
    }

    public void addTimeSpan(TimeSpan value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public IconStyle getIconStyle()
    {
        if(this.objectNode instanceof IconStyle)
        {
            return (IconStyle)this.objectNode;
        }
        return null;
    }

    public void addIconStyle(IconStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LineStyle getLineStyle()
    {
        if(this.objectNode instanceof LineStyle)
        {
            return (LineStyle)this.objectNode;
        }
        return null;
    }

    public void addLineStyle(LineStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LabelStyle getLabelStyle()
    {
        if(this.objectNode instanceof LabelStyle)
        {
            return (LabelStyle)this.objectNode;
        }
        return null;
    }

    public void addLabelStyle(LabelStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public PolyStyle getPolyStyle()
    {
        if(this.objectNode instanceof PolyStyle)
        {
            return (PolyStyle)this.objectNode;
        }
        return null;
    }

    public void addPolyStyle(PolyStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Orientation getOrientation()
    {
        if(this.objectNode instanceof Orientation)
        {
            return (Orientation)this.objectNode;
        }
        return null;
    }

    public void addOrientation(Orientation value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public BalloonStyle getBalloonStyle()
    {
        if(this.objectNode instanceof BalloonStyle)
        {
            return (BalloonStyle)this.objectNode;
        }
        return null;
    }

    public void addBalloonStyle(BalloonStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LookAt getLookAt()
    {
        if(this.objectNode instanceof LookAt)
        {
            return (LookAt)this.objectNode;
        }
        return null;
    }

    public void addLookAt(LookAt value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public StyleMap getStyleMap()
    {
        if(this.objectNode instanceof StyleMap)
        {
            return (StyleMap)this.objectNode;
        }
        return null;
    }

    public void addStyleMap(StyleMap value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Style getStyle()
    {
        if(this.objectNode instanceof Style)
        {
            return (Style)this.objectNode;
        }
        return null;
    }

    public void addStyle(Style value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Model getModel()
    {
        if(this.objectNode instanceof Model)
        {
            return (Model)this.objectNode;
        }
        return null;
    }

    public void addModel(Model value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LinearRing getLinearRing()
    {
        if(this.objectNode instanceof LinearRing)
        {
            return (LinearRing)this.objectNode;
        }
        return null;
    }

    public void addLinearRing(LinearRing value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Point getPoint()
    {
        if(this.objectNode instanceof Point)
        {
            return (Point)this.objectNode;
        }
        return null;
    }

    public void addPoint(Point value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public MultiGeometry getMultiGeometry()
    {
        if(this.objectNode instanceof MultiGeometry)
        {
            return (MultiGeometry)this.objectNode;
        }
        return null;
    }

    public void addMultiGeometry(MultiGeometry value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Polygon getPolygon()
    {
        if(this.objectNode instanceof Polygon)
        {
            return (Polygon)this.objectNode;
        }
        return null;
    }

    public void addPolygon(Polygon value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public LineString getLineString()
    {
        if(this.objectNode instanceof LineString)
        {
            return (LineString)this.objectNode;
        }
        return null;
    }

    public void addLineString(LineString value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Location getLocation()
    {
        if(this.objectNode instanceof Location)
        {
            return (Location)this.objectNode;
        }
        return null;
    }

    public void addLocation(Location value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public ListStyle getListStyle()
    {
        if(this.objectNode instanceof ListStyle)
        {
            return (ListStyle)this.objectNode;
        }
        return null;
    }

    public void addListStyle(ListStyle value)
    {
        if(this.objectNode!=null)
        {
            markDeletedNode(this.objectNode);
        }
        this.objectNode = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Feature getFeature()
    {
        return this.feature;
    }

    public void addFeature(Feature value)
    {
        if(this.feature!=null)
        {
            markDeletedNode(this.feature);
        }
        this.feature = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public Geometry getGeometry()
    {
        return this.geometry;
    }

    public void addGeometry(Geometry value)
    {
        if(this.geometry!=null)
        {
            markDeletedNode(this.geometry);
        }
        this.geometry = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public StyleSelector getStyleSelector()
    {
        return this.styleSelector;
    }

    public void addStyleSelector(StyleSelector value)
    {
        if(this.styleSelector!=null)
        {
            markDeletedNode(this.styleSelector);
        }
        this.styleSelector = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }

    public TimePrimitive getTimePrimitive()
    {
        return this.timePrimitive;
    }

    public void addTimePrimitive(TimePrimitive value)
    {
        if(this.timePrimitive!=null)
        {
            markDeletedNode(this.timePrimitive);
        }
        this.timePrimitive = value;
        if(value!=null)
        {
            value.setParent(this);
            markCreatedNode(value);
        }
    }



    public String toKML()
    {
        return toKML(false);
    }
    public String toKML(boolean suppressEnclosingTags)
    {
        String kml="";
        if(!suppressEnclosingTags)
        {
        kml+="<Change";
        kml+=">\n";
        }
        kml+=super.toKML(true);
        if(this.objectNode!=null)
        {
            kml+=this.objectNode.toKML();
        }
        if(this.feature!=null)
        {
            kml+=this.feature.toKML();
        }
        if(this.geometry!=null)
        {
            kml+=this.geometry.toKML();
        }
        if(this.styleSelector!=null)
        {
            kml+=this.styleSelector.toKML();
        }
        if(this.timePrimitive!=null)
        {
            kml+=this.timePrimitive.toKML();
        }
        if(!suppressEnclosingTags)
        {
            kml+="</Change>\n";
        }
        return kml;
    }
    public String toUpdateKML()
    {
        return toUpdateKML(false);
    }
    public String toUpdateKML(boolean suppressEnclosingTags)
    {
        if(!isDirty())
        {
            return "";
        }
        String change = "";
        boolean isPrimDirty = isPrimitiveDirty(); // need to track it after object is setNotDirty
        if(isPrimDirty && !suppressEnclosingTags)
        {
        change+="<Change";
        change+=">\n";
        }
        change+=super.toUpdateKML(true);
        if(this.objectNode!=null && this.objectNode.isDirty())
        {
            change+=this.objectNode.toUpdateKML();
        }
        if(this.feature!=null && this.feature.isDirty())
        {
            change+=this.feature.toUpdateKML();
        }
        if(this.geometry!=null && this.geometry.isDirty())
        {
            change+=this.geometry.toUpdateKML();
        }
        if(this.styleSelector!=null && this.styleSelector.isDirty())
        {
            change+=this.styleSelector.toUpdateKML();
        }
        if(this.timePrimitive!=null && this.timePrimitive.isDirty())
        {
            change+=this.timePrimitive.toUpdateKML();
        }
        if(isPrimDirty && !suppressEnclosingTags)
        {
        change+="</Change>\n";
        }
        setNotDirty();
        return change;
    }
    public Object clone() throws CloneNotSupportedException
    {
        Change result = (Change)super.clone();
      if(result.objectNode!=null)
      {
        result.objectNode = (ObjectNode)this.objectNode.clone();
        result.objectNode.setParent(result);
      }
      if(result.feature!=null)
      {
        result.feature = (Feature)this.feature.clone();
        result.feature.setParent(result);
      }
      if(result.geometry!=null)
      {
        result.geometry = (Geometry)this.geometry.clone();
        result.geometry.setParent(result);
      }
      if(result.styleSelector!=null)
      {
        result.styleSelector = (StyleSelector)this.styleSelector.clone();
        result.styleSelector.setParent(result);
      }
      if(result.timePrimitive!=null)
      {
        result.timePrimitive = (TimePrimitive)this.timePrimitive.clone();
        result.timePrimitive.setParent(result);
      }
        return result;
    }
    public void setRecursiveNotDirty()
    {
        super.setRecursiveNotDirty();
        if(this.objectNode!=null && this.objectNode.isDirty())
        {
            this.objectNode.setRecursiveNotDirty();
        }
        if(this.feature!=null && this.feature.isDirty())
        {
            this.feature.setRecursiveNotDirty();
        }
        if(this.geometry!=null && this.geometry.isDirty())
        {
            this.geometry.setRecursiveNotDirty();
        }
        if(this.styleSelector!=null && this.styleSelector.isDirty())
        {
            this.styleSelector.setRecursiveNotDirty();
        }
        if(this.timePrimitive!=null && this.timePrimitive.isDirty())
        {
            this.timePrimitive.setRecursiveNotDirty();
        }
    }
}
