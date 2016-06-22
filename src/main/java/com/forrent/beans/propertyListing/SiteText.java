package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class SiteText implements Serializable
{
    private String id;

    private Map<Locale, String> text;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Map<Locale, String> getText()
    {
        return text;
    }

    public void setText(Map<Locale, String> text)
    {
        this.text = text;
    }
}
