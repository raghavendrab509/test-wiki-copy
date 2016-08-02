package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FloorplanSummary implements IObjectWithId, Serializable
{
    public static final String ALL_ID = "ALL";

    private Range<Double> bathrooms = new Range<Double>();
    private Range<Integer> bedrooms = new Range<Integer>();
    private String id;
    private Range<Integer> price = new Range<Integer>();
    private Range<Integer> squareFeet = new Range<Integer>();

    public Range<Double> getBathrooms() {
        return this.bathrooms;
    }

    public Range<Integer> getBedrooms() {
        return this.bedrooms;
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

    public void setBathrooms(final Range<Double> bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(final Range<Integer> bedrooms) {
        this.bedrooms = bedrooms;
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
