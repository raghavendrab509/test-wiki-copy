package com.forrent.beans.geography.entity;

public class Detail
{
    private String abbreviation;
    private Address address;
    private String findUri;
    private Character firstLetter;
    private PropertyCountCollection propertyCounts = new PropertyCountCollection();
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

    public PropertyCountCollection getPropertyCounts() {
        return this.propertyCounts;
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

    public void setPropertyCounts(final PropertyCountCollection propertyCounts) {
        this.propertyCounts = propertyCounts;
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
