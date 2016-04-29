package com.forrent.beans.listing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Geography implements Serializable
{
    private String address_one;
    private String address_two;
    private String city_id;
    private String city_name;
    private String country_code;
    private GeographyPoint location;
    private String metro_id;
    private String metro_name;
    private String state_code;
    private String state_id;
    private String state_name;
    private String super_city_id;
    private String super_city_name;
    private Integer zip_code;
    private Integer zip_ext;

    public Geography() {}

    public String getAddress_one() {
        return this.address_one;
    }

    public void setAddress_one(final String address_one) {
        this.address_one = address_one;
    }

    public String getAddress_two() {
        return this.address_two;
    }

    public void setAddress_two(final String address_two) {
        this.address_two = address_two;
    }

    public String getCity_id() {
        return this.city_id;
    }

    public void setCity_id(final String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return this.city_name;
    }

    public void setCity_name(final String city_name) {
        this.city_name = city_name;
    }

    public String getCountry_code() {
        return this.country_code;
    }

    public void setCountry_code(final String country_code) {
        this.country_code = country_code;
    }

    public GeographyPoint getLocation() {
        return this.location;
    }

    public void setLocation(final GeographyPoint location) {
        this.location = location;
    }

    public String getMetro_id() {
        return this.metro_id;
    }

    public void setMetro_id(final String metro_id) {
        this.metro_id = metro_id;
    }

    public String getMetro_name() {
        return this.metro_name;
    }

    public void setMetro_name(final String metro_name) {
        this.metro_name = metro_name;
    }

    public String getState_code() {
        return this.state_code;
    }

    public void setState_code(final String state_code) {
        this.state_code = state_code;
    }

    public String getState_id() {
        return this.state_id;
    }

    public void setState_id(final String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return this.state_name;
    }

    public void setState_name(final String state_name) {
        this.state_name = state_name;
    }

    public String getSuper_city_id() {
        return this.super_city_id;
    }

    public void setSuper_city_id(final String super_city_id) {
        this.super_city_id = super_city_id;
    }

    public String getSuper_city_name() {
        return this.super_city_name;
    }

    public void setSuper_city_name(final String super_city_name) {
        this.super_city_name = super_city_name;
    }

    public Integer getZip_code() {
        return this.zip_code;
    }

    public void setZip_code(final Integer zip_code) {
        this.zip_code = zip_code;
    }

    public Integer getZip_ext() {
        return this.zip_ext;
    }

    public void setZip_ext(final Integer zip_ext) {
        this.zip_ext = zip_ext;
    }
}
