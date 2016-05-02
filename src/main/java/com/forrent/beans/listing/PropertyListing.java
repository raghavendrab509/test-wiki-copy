package com.forrent.beans.listing;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class PropertyListing implements Serializable
{
    private Account account;
    private Geography geo;
    private String id;
    private Map<String, Image> listingImages;
    private String name;

    public Account getAccount() {
        return this.account;
    }

    public Geography getGeo() {
        return this.geo;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Image> getListingImages() {
        return this.listingImages;
    }

    public String getName() {
        return name;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }

    public void setGeo(final Geography geo) {
        this.geo = geo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setListingImages(final Map<String, Image> listingImages) {
        this.listingImages = listingImages;
    }

    public void setName(String name) {
        this.name = name;
    }
}
