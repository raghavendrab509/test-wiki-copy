package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Amenity implements Serializable
{
    private String category;
    private String name;
    private Boolean searchable;
    private String searchableCategory;
    private String websiteCode;

    public String getCategory() {
        return this.category;
    }

    public String getName() {
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

    public void setName(final String name) {
        this.name = name;
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
