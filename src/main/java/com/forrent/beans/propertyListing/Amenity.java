package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Amenity implements IObjectWithId, Serializable
{
    private String category;
    private String id;
    private final Translated<String> name = new Translated<String>();
    private Boolean searchable;
    private String searchableCategory;
    private String websiteCode;

    public String getCategory() {
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

    public String getSearchableCategory() {
        return this.searchableCategory;
    }

    public String getWebsiteCode() {
        return this.websiteCode;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.name.setEn(text);
        } else {
            this.name.setEs(text);
        }

    }

    public void setSearchable(final Boolean searchable) {
        this.searchable = searchable;
    }

    public void setSearchableCategory(final String searchableCategory) {
        this.searchableCategory = searchableCategory;
    }

    public void setWebsiteCode(final String websiteCode) {
        this.websiteCode = websiteCode;
    }
}
