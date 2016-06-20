package com.forrent.beans.propertyListing.featuredListing;

@SuppressWarnings("serial")
public class FRCFeatured extends BaseFeaturedListing
{
    private String areaId;
    private String areaName;
    private String headline;

    public String getAreaId()
    {
        return this.areaId;
    }

    public void setAreaId(final String areaId)
    {
        this.areaId = areaId;
    }

    public String getAreaName()
    {
        return this.areaName;
    }

    public void setAreaName(final String areaName)
    {
        this.areaName = areaName;
    }

    public String getHeadline()
    {
        return this.headline;
    }

    public void setHeadline(final String headline)
    {
        this.headline = headline;
    }
}
