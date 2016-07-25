package com.forrent.beans.propertyListing;

public class Image implements IObjectWithType
{
    public static final String TYPE_COM_EMAILER = "comEmailer";
    public static final String TYPE_PROFILE_PHOTO = "profilePhoto";
    public static final String TYPE_CUST_SPTL = "custSptl";
    public static final String TYPE_FEAT_PROPERTY = "Featured Property";
    public static final String TYPE_SDET_PROPERTY_LOGO = "sdetpropertylogo";
    public static final String TYPE_KEYWORD_IMAGE = "Keyword Image";

    private String caption;
    private Integer displayOrder;
    private String fileName;
    private Integer rotation;
    private String type;

    public String getCaption() {
        return this.caption;
    }

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Integer getRotation() {
        return this.rotation;
    }

    @Override
    public String getType() {
        return this.type;
    }

    public void setCaption(final String caption) {
        this.caption = caption;
    }

    public void setDisplayOrder(final Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setRotation(final Integer rotation) {
        this.rotation = rotation;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
