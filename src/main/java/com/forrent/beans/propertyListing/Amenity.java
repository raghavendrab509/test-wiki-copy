package com.forrent.beans.propertyListing;

import com.forrent.beans.common.IObjectWithId;
import com.forrent.beans.common.Locale;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Amenity implements IObjectWithId, Serializable
{
    private String id;
    private Boolean searchable;
    private final Translated<String> name = new Translated<String>();
    private final Translated<String> category = new Translated<String>();
    private final Translated<String> searchableCategory = new Translated<String>();
    private String websiteCode;

    public Translated<String> getCategory()
    {
        return this.category;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public Translated<String> getName() {
        return this.name;
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public Translated<String> getSearchableCategory()
    {
        return this.searchableCategory;
    }

    public String getWebsiteCode() {
        return this.websiteCode;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String text, final Locale locale)
    {
        if (locale == Locale.EN) {
            this.name.setEn(text);
        } else {
            this.name.setEs(text);
        }
    }

    public void setSearchable(final Boolean searchable)
    {
        this.searchable = searchable;
    }

    public void setWebsiteCode(final String websiteCode)
    {
        this.websiteCode = websiteCode;
    }

    public void setCategory(final String text, final Locale locale)
    {
        if (locale == Locale.EN) {
            this.category.setEn(text);
        } else {
            this.category.setEs(text);
        }
    }

    public void setSearchableCategory(final String text, final Locale locale)
    {
        if (locale == Locale.EN) {
            this.searchableCategory.setEn(text);
        } else {
            this.searchableCategory.setEs(text);
        }
    }
}
