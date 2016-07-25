package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.Optional;

@SuppressWarnings("serial")
public class PropertyListing implements Serializable
{
    private Account account = new Account();
    private Detail detail = new Detail();
    private FeaturedListingCollection featuredListings = new FeaturedListingCollection();
    private Geography geo = new Geography();
    private String id;
    private ObjectWithTypeCollection<Image> images = new ObjectWithTypeCollection<Image>();
    private String name;
    private ObjectWithIdCollection<PhoneNumber> phoneNumbers = new ObjectWithIdCollection<PhoneNumber>();
    private ApartmentProperty property = new ApartmentProperty();
    private ObjectWithIdCollection<SiteText> siteTexts = new ObjectWithIdCollection<SiteText>();

    public Account getAccount() {
        return this.account;
    }

    public Detail getDetail() {
        return this.detail;
    }

    public FeaturedListingCollection getFeaturedListings()
    {
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

    public Image getImages(final Integer index) {
        return this.images.getContent().get(index);
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

    public void setAccount(final Account account) {
        this.account = account;
    }

    public void setDetail(final Detail detail) {
        this.detail = detail;
    }

    public void setFeaturedListings(final FeaturedListingCollection featuredListings)
    {
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
}
