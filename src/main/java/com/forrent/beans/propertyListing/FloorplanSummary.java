package com.forrent.beans.propertyListing;

import com.forrent.beans.common.IObjectWithId;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FloorplanSummary implements IObjectWithId, Serializable
{
    public static final String ALL_ID = "ALL";

    private Range<Double> baths = new Range<Double>();
    private Range<Integer> beds = new Range<Integer>();
    private String id;
    private Range<Integer> price = new Range<Integer>();
    private Range<Integer> squareFeet = new Range<Integer>();

    public Range<Double> getBaths() {
        return this.baths;
    }

    public Range<Integer> getBeds() {
        return this.beds;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public Range<Integer> getPrice() {
        return this.price;
    }

    public Range<Integer> getSquareFeet() {
        return this.squareFeet;
    }

    public void setBaths(final Range<Double> bathrooms) {
        this.baths = bathrooms;
    }

    public void setBeds(final Range<Integer> bedrooms) {
        this.beds = bedrooms;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setPrice(final Range<Integer> price) {
        this.price = price;
    }

    public void setSquareFeet(final Range<Integer> squareFeet) {
        this.squareFeet = squareFeet;
    }
}
