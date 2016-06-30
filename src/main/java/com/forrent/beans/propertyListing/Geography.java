package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Geography implements Serializable
{
    private String addressOne;
    private String addressTwo;
    private String cityId;
    private String cityName;
    private String countryCode;
    private GeographyPoint location = new GeographyPoint();
    private List<School> schools = new ArrayList<School>();
    private String metroId;
    private String metroName;
    private String stateCode;
    private String stateId;
    private String stateName;
    private String superCityId;
    private String superCityName;
    private String zipCode;
    private String zipExt;
    private List<Neighborhood> neighborhoods = new ArrayList<Neighborhood>();

    public String getAddressOne() {
        return this.addressOne;
    }

    public String getAddressTwo() {
        return this.addressTwo;
    }

    public String getCityId() {
        return this.cityId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public GeographyPoint getLocation() {
        return this.location;
    }

    public List<School> getSchools() {
        return this.schools;
    }

    public School getSchools(final Integer index) {
        return this.schools.get(index);
    }

    public String getMetroId() {
        return this.metroId;
    }

    public String getMetroName() {
        return this.metroName;
    }

    public String getStateCode() {
        return this.stateCode;
    }

    public String getStateId() {
        return this.stateId;
    }

    public String getStateName() {
        return this.stateName;
    }

    public String getSuperCityId() {
        return this.superCityId;
    }

    public String getSuperCityName() {
        return this.superCityName;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getZipExt() {
        return this.zipExt;
    }

    public void setAddressOne(final String addressOne) {
        this.addressOne = addressOne;
    }

    public void setAddressTwo(final String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public void setCityId(final String cityId) {
        this.cityId = cityId;
    }

    public void setCityName(final String cityName) {
        this.cityName = cityName;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public void setLocation(final GeographyPoint location) {
        this.location = location;
    }

    public void setSchools(final List<School> schools) {
        this.schools = schools;
    }

    public void setMetroId(final String metroId) {
        this.metroId = metroId;
    }

    public void setMetroName(final String metroName) {
        this.metroName = metroName;
    }

    public void setStateCode(final String stateCode) {
        this.stateCode = stateCode;
    }

    public void setStateId(final String stateId) {
        this.stateId = stateId;
    }

    public void setStateName(final String stateName) {
        this.stateName = stateName;
    }

    public void setSuperCityId(final String superCityId) {
        this.superCityId = superCityId;
    }

    public void setSuperCityName(final String superCityName) {
        this.superCityName = superCityName;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public void setZipExt(final String zipExt) {
        this.zipExt = zipExt;
    }

    public List<Neighborhood> getNeighborhoods() {
        return this.neighborhoods;
    }

    public Neighborhood getNeighborhoods(final Integer index) {
        return this.neighborhoods.get(index);
    }

    public void setNeighborhoods(final List<Neighborhood> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }
}