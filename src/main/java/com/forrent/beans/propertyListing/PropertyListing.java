package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("serial")
public class PropertyListing implements Serializable
{
    private Account account;
    private Geography geo;
    private String id;
    private List<Image> images;
    private String name;
    private Map<String, PhoneNumber> phoneNumbers;
    private ApartmentProperty property;

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
        return property;
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

    public void setimages(final List<Image> images) {
        this.images = images;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPhoneNumbers(final Map<String, PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setProperty(ApartmentProperty property) {
        this.property = property;
    }
}
