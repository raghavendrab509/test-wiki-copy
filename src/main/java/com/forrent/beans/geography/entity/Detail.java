package com.forrent.beans.geography.entity;

import java.util.ArrayList;
import java.util.List;

public class Detail
{
    private String abbreviation;
    private Address address;
    private String findUri;
    private Character firstLetter;
    private List<ListingCount> listingCounts = new ArrayList<>();
    private SchoolInfo schoolInfo = new SchoolInfo();
    private String vanityName;
    private String website;

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getFindUri() {
        return this.findUri;
    }

    public Character getFirstLetter() {
        return this.firstLetter;
    }

    public List<ListingCount> getListingCounts() {
        return this.listingCounts;
    }

    public SchoolInfo getSchoolInfo() {
        return this.schoolInfo;
    }

    public String getVanityName() {
        return this.vanityName;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public void setFindUri(final String findUri) {
        this.findUri = findUri;
    }

    public void setFirstLetter(final Character firstLetter) {
        this.firstLetter = firstLetter;
    }

    public void setPropertyCounts(final List<ListingCount> listingCounts) {
        this.listingCounts = listingCounts;
    }

    public void setSchoolInfo(final SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public void setVanityName(final String vanityName) {
        this.vanityName = vanityName;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }
}
