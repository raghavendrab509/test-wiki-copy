package com.forrent.beans.propertyListing;

import com.forrent.beans.common.FeaturedListing;
import com.forrent.beans.common.Image;
import com.forrent.beans.common.ObjectWithIdAndTypeCollection;
import com.forrent.beans.common.ObjectWithIdCollection;
import com.forrent.beans.common.ObjectWithTypeCollection;

import java.io.Serializable;
import java.util.Optional;

@SuppressWarnings("serial")
public class PropertyListing implements Serializable
{
    private String id;
    private String name;
    private Detail detail = new Detail();
    private ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings = new ObjectWithIdAndTypeCollection<>();
    private Geography geo = new Geography();
    private ObjectWithTypeCollection<Image> images = new ObjectWithTypeCollection<>();
    private ObjectWithIdCollection<PhoneNumber> phoneNumbers = new ObjectWithIdCollection<>();
    private ApartmentProperty property = new ApartmentProperty();
    private Resources resources = new Resources();
    private ObjectWithIdCollection<SiteText> siteTexts = new ObjectWithIdCollection<>();
    private PropertyReviewsCollection reviews = new PropertyReviewsCollection();

    public Detail getDetail() {
        return this.detail;
    }

    public ObjectWithIdAndTypeCollection<FeaturedListing> getFeaturedListings() {
        return this.featuredListings;
    }

    public Geography getGeo() {
        return this.geo;
    }

    public String getId() {
        return this.id;
    }

    public ObjectWithTypeCollection<Image> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public ObjectWithIdCollection<PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public Optional<PhoneNumber> getPhoneNumbers(final String type)
    {
        return this.phoneNumbers.get(type);
    }

    public ApartmentProperty getProperty() {
        return this.property;
    }

    public ObjectWithIdCollection<SiteText> getSiteTexts() {
        return this.siteTexts;
    }

    public void setDetail(final Detail detail) {
        this.detail = detail;
    }

    public void setFeaturedListings(final ObjectWithIdAndTypeCollection<FeaturedListing> featuredListings) {
        this.featuredListings = featuredListings;
    }

    public void setGeo(final Geography geo) {
        this.geo = geo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setImages(final ObjectWithTypeCollection<Image> images) {
        this.images = images;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPhoneNumbers(final ObjectWithIdCollection<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setProperty(final ApartmentProperty property) {
        this.property = property;
    }

    public void setSiteTexts(final ObjectWithIdCollection<SiteText> siteTexts) {
        this.siteTexts = siteTexts;
    }

    public PropertyReviewsCollection getReviews() {
        return this.reviews;
    }

    public void setReviews(final PropertyReviewsCollection reviews) {
        this.reviews = reviews;
    }

    public Resources getResources() {
        return this.resources;
    }

    public void setResources(final Resources resources) {
        this.resources = resources;
    }
}
