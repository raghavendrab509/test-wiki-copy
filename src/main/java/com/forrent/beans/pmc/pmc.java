package com.forrent.beans.pmc;

import com.forrent.beans.common.FeaturedListing;
import com.forrent.beans.common.Image;
import com.forrent.beans.common.ObjectWithIdAndTypeCollection;
import com.forrent.beans.common.ObjectWithTypeCollection;

import java.io.Serializable;

@SuppressWarnings("serial")
public class pmc implements Serializable
{
    private String id;
    private String name;
    private Detail detail = new Detail();
    private ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings = new ObjectWithIdAndTypeCollection<>();
    private ObjectWithTypeCollection<Image> images = new ObjectWithTypeCollection<>();

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public Detail getDetail()
    {
        return this.detail;
    }

    public ObjectWithIdAndTypeCollection<FeaturedListing> getFeaturedListings()
    {
        return this.featuredListings;
    }

    public ObjectWithTypeCollection<Image> getImages()
    {
        return this.images;
    }

    public void setId(final String id)
    {
        this.id = id;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setDetail(final Detail detail)
    {
        this.detail = detail;
    }

    public void setFeaturedListings(final ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings)
    {
        this.featuredListings = featuredListings;
    }

    public void setImages(final ObjectWithTypeCollection<Image> images)
    {
        this.images = images;
    }

}
