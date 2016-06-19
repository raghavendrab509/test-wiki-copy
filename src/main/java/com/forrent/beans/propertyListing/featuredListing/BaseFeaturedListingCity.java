package com.forrent.beans.propertyListing.featuredListing;

@SuppressWarnings("serial")
public class BaseFeaturedListingCity extends BaseFeaturedListing
{
    private String stateCode;
    private String cityId;
    private String cityName;

    public String getStateCode()
    {
        return this.stateCode;
    }

    public void setStateCode(final String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getCityId()
    {
        return this.cityId;
    }

    public void setCityId(final String cityId)
    {
        this.cityId = cityId;
    }

    public String getCityName()
    {
        return this.cityName;
    }

    public void setCityName(final String cityName)
    {
        this.cityName = cityName;
    }
}
