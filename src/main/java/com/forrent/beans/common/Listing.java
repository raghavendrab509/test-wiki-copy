package com.forrent.beans.common;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Listing implements Serializable
{
    protected String id;
    protected String name;
    protected ListingType listingType;
    protected ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings = new ObjectWithIdAndTypeCollection<>();
    protected ObjectWithTypeCollection<Image> images = new ObjectWithTypeCollection<>();

    public String getId()
    {
        return this.id;
    }
    public void setId(final String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(final String name)
    {
        this.name = name;
    }
    public ListingType getListingType()
    {
        return this.listingType;
    }
    public void setListingType(final ListingType entityType)
    {
        this.listingType = entityType;
    }
    public ObjectWithIdAndTypeCollection<FeaturedListing> getFeaturedListings()
    {
        return this.featuredListings;
    }
    public void setFeaturedListings(final ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings)
    {
        this.featuredListings = featuredListings;
    }
    public ObjectWithTypeCollection<Image> getImages()
    {
        return this.images;
    }
    public void setImages(final ObjectWithTypeCollection<Image> images)
    {
        this.images = images;
    }

}
