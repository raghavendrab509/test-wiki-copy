package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("serial")
public class PropertyListing implements Serializable
{
    private Account account = new Account();
    private Geography geo = new Geography();
    private String id;
    private List<Image> images = new ArrayList<Image>();
    private String name;
    private Map<String, PhoneNumber> phoneNumbers = new HashMap<String, PhoneNumber>();
    private ApartmentProperty property = new ApartmentProperty();;
    private Detail detail = new Detail();
    private FeaturedListingCollection featuredListings = new FeaturedListingCollection();
    private List<SiteText> siteTexts = new ArrayList<SiteText>();
    private List<Product> products = new ArrayList<Product>();

    public Account getAccount() {
        return this.account;
    }

    public Geography getGeo() {
        return this.geo;
    }

    public String getId() {
        return this.id;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public Image getImages(final Integer index) {
        return this.images.get(index);
    }

    public String getName() {
        return this.name;
    }

    public Map<String, PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public Optional<PhoneNumber> getPhoneNumbers(final String type)
    {
        final PhoneNumber number = this.phoneNumbers.get(type);
        return Optional.ofNullable(number);
    }

    public ApartmentProperty getProperty() {
        return this.property;
    }

    public Detail getDetail() {
    	return this.detail;
    }

    public FeaturedListingCollection getFeaturedListings()
    {
        return this.featuredListings;
    }

    public List<SiteText> getSiteTexts()
    {
        return this.siteTexts;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public Boolean hasProduct(Product product)
    {
        return this.products.contains(product);
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

    public void setImages(final List<Image> images) {
        this.images = images;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPhoneNumbers(final Map<String, PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setProperty(final ApartmentProperty property) {
        this.property = property;
    }

    public void setDetail(final Detail detail) {
    	this.detail = detail;
    }

    public void setFeaturedListings(final FeaturedListingCollection featuredListings)
    {
        this.featuredListings = featuredListings;
    }

    public void setSiteTexts(final List<SiteText> siteTexts)
    {
        this.siteTexts = siteTexts;
    }

    public void setProducts(List<Product> products)
    {
        this.products = products;
    }
}
