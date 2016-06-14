package com.forrent.beans.propertyListing.ad;

public class MobileSelect extends BaseAd
{
    private String metroName;
    private String stateCode;
    private String cityName;

    public String getMetroName()
    {
        return metroName;
    }

    public void setMetroName(String metroName)
    {
        this.metroName = metroName;
    }

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
}
