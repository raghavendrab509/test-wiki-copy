package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class SiteText implements IObjectWithId, Serializable
{
    private String id;
    private String name;
    private final Translated<List<String>> text = new Translated<List<String>>();

    public SiteText() {
        this.text.setEn(new ArrayList<String>());
        this.text.setEs(new ArrayList<String>());
    }

    public void addText(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.text.getEn().add(text);
        } else {
            this.text.getEs().add(text);
        }
    }

    public Translated<List<String>> getText() {
        return this.text;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
