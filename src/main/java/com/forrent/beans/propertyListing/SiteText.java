package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.List;

public class SiteText implements IObjectWithId
{
    private String id;
    private String name;
    private Translated<List<String>> text = new Translated<>();

    public SiteText()
    {
        this.text.setEn(new ArrayList<String>());
        this.text.setEs(new ArrayList<String>());
    }

    public SiteText(final String id, final String name)
    {
        this.id = id;
        this.name = name;

        this.text.setEn(new ArrayList<String>());
        this.text.setEs(new ArrayList<String>());
    }

    public SiteText addText(final String text, final Locale locale)
    {
        if (locale == Locale.EN) {
            this.text.getEn().add(text);
        } else {
            this.text.getEs().add(text);
        }

        return this;
    }

    public SiteText addText(final String text, final String locale)
    {
        return this.addText(text, Locale.valueOf(locale));
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Translated<List<String>> getText() {
        return this.text;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setText(final Translated<List<String>> text) {
        this.text = text;
    }
}
