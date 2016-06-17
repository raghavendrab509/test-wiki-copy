package com.forrent.beans.propertyListing.featuredListing;


import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseFeaturedListing implements Serializable
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
