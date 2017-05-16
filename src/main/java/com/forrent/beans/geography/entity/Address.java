package com.forrent.beans.geography.entity;

public class Address
{
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

    public String getAddress1() {
        return this.address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }
}
