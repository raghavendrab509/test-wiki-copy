package com.forrent.beans.common;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyListingEntity implements Serializable
{
    protected String id;
    protected String name;
    protected PropertyListingEntityType entityType;
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
    public PropertyListingEntityType getEntityType()
    {
        return this.entityType;
    }
    public void setEntityType(final PropertyListingEntityType entityType)
    {
        this.entityType = entityType;
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
