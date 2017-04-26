package com.forrent.beans.propertyListing;

import com.forrent.beans.common.ObjectWithIdCollection;

import java.util.ArrayList;
import java.util.List;

public class Geography
{
    private String addressOne;
    private String addressTwo;
    private String areaName;
    private String cityId;
    private String cityName;
    private String countryCode;
    private GeographyPoint location = new GeographyPoint();
    private List<Double> locationPoint = new ArrayList<Double>();
    private String metroId;
    private String metroName;
    private ObjectWithIdCollection<Neighborhood> neighborhoods = new ObjectWithIdCollection<>();
    private ObjectWithIdCollection<School> schools = new ObjectWithIdCollection<>();
    private String stateCode;
    private String stateId;
    private String stateName;
    private String superCityId;
    private String superCityName;
    private String zipCode;
    private String zipExt;

    public String getAddressOne() {
        return this.addressOne;
    }

    public String getAddressTwo() {
        return this.addressTwo;
    }

    public String getAreaName() {
        return this.areaName;
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

    public List<Double> getLocationPoint()
    {
        return this.locationPoint;
    }

    public String getMetroId() {
        return this.metroId;
    }

    public String getMetroName() {
        return this.metroName;
    }

    public ObjectWithIdCollection<Neighborhood> getNeighborhoods() {
        return this.neighborhoods;
    }

    public ObjectWithIdCollection<School> getSchools() {
        return this.schools;
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

    /**
     * Also known as Area Id.
     */
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

    public void setAreaName(final String areaName) {
        this.areaName = areaName;
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

    public void setLocationPoint(final List<Double> locationPoint)
    {
        this.locationPoint = locationPoint;
    }

    public void setMetroId(final String metroId) {
        this.metroId = metroId;
    }

    public void setMetroName(final String metroName) {
        this.metroName = metroName;
    }

    public void setNeighborhoods(final ObjectWithIdCollection<Neighborhood> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public void setSchools(final ObjectWithIdCollection<School> schools) {
        this.schools = schools;
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
}