package com.forrent.beans.propertyListing.ad;

public class HeroVideo extends BaseAd
{
    private String stateCode;
    private String cityName;
    private String metroName;

    public String getStateCode()
    {
        return stateCode;
    }

    public void setStateCode(String stateCode)
    {
        this.stateCode = stateCode;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getMetroName()
    {
        return metroName;
    }

    public void setMetroName(String metroName)
    {
        this.metroName = metroName;
    }
}
