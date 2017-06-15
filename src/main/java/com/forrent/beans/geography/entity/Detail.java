package com.forrent.beans.geography.entity;

import java.util.ArrayList;
import java.util.List;

import com.forrent.beans.common.Context;
import com.forrent.beans.common.Locale;

public class Detail
{
    private String abbreviation;
    private Address address;
    private String findUri;
    private Character firstLetter;
    private Boolean hasBestPlaces;
    private Boolean hasLocalGuide;
    private List<ListingCount> listingCounts = new ArrayList<>();
    private SchoolInfo schoolInfo = new SchoolInfo();
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
    public Boolean getHasBestPlaces() {
        return this.hasBestPlaces;
    }

    public Boolean getHasLocalGuide() {
        return this.hasLocalGuide;
    }

    public Integer getListingCount(final Context context, final Locale locale)
    {
        for(final ListingCount count : this.listingCounts) {
            if (count.getContext() == context && count.getLocale() == locale) {
                return count.getCount();
            }
        }

        return null;
    }

    public List<ListingCount> getListingCounts() {
        return this.listingCounts;
    }

    public SchoolInfo getSchoolInfo() {
        return this.schoolInfo;
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

    public void setHasBestPlaces(final Boolean hasBestPlaces) {
        this.hasBestPlaces = hasBestPlaces;
    }

    public void setHasLocalGuide(final Boolean hasLocalGuide) {
        this.hasLocalGuide = hasLocalGuide;
    }

    public void setListingCounts(final List<ListingCount> listingCounts) {
        this.listingCounts = listingCounts;
    }

    public void setPropertyCounts(final List<ListingCount> listingCounts) {
        this.listingCounts = listingCounts;
    }

    public void setSchoolInfo(final SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }
}
