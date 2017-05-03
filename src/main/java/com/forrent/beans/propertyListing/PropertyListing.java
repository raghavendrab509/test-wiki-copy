package com.forrent.beans.propertyListing;

import com.forrent.beans.common.ObjectWithIdCollection;
import com.forrent.beans.common.PropertyListingEntity;
import com.forrent.beans.common.PropertyListingEntityType;

import java.util.Optional;

@SuppressWarnings("serial")
public class PropertyListing extends PropertyListingEntity
{
    private Detail detail = new Detail();
    private Geography geo = new Geography();
    private ObjectWithIdCollection<PhoneNumber> phoneNumbers = new ObjectWithIdCollection<>();
    private ApartmentProperty property = new ApartmentProperty();
    private Resources resources = new Resources();
    private ObjectWithIdCollection<SiteText> siteTexts = new ObjectWithIdCollection<>();
    private PropertyReviewsCollection reviews = new PropertyReviewsCollection();

    public PropertyListing()
    {
        this.entityType = PropertyListingEntityType.PROPERTY_LISTING;
    }

    public Detail getDetail() {
        return this.detail;
    }

    public Geography getGeo() {
        return this.geo;
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

    public void setGeo(final Geography geo) {
        this.geo = geo;
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
