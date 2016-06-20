package com.forrent.beans.propertyListing.featuredListing;

@SuppressWarnings("serial")
public class BaseFeaturedListingMetro extends BaseFeaturedListing
{
    private String metroId;
    private String metroName;

    public String getMetroId()
    {
        return this.metroId;
    }

    public void setMetroId(final String metroId)
    {
        this.metroId = metroId;
    }

    public String getMetroName()
    {
        return this.metroName;
    }

    public void setMetroName(final String metroName)
    {
        this.metroName = metroName;
    }
}
