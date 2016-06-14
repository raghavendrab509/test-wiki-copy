package com.forrent.beans.propertyListing.ad;


import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseAd implements Serializable
{
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
