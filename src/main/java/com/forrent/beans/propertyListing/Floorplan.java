package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Floorplan implements IObjectWithId, Serializable
{
    private Boolean active;
    private String applicationFees;
    private Double baths;
    private Integer beds;
    private Double brokerFee;
    private Double deposit;
    private String floorplanImage2d;
    private String floorplanImage3d;
    private String id;
    private String imageFilename;
    private String insideViewImage;
    private String leaseTerms;
    private String modelFilename;
    private String name;
    private Boolean perBedPricing;
    private String phone;
    private Range<Integer> price = new Range<Integer>();
    private Integer rentableUnits;
    private String requestToHoldUrl;
    private Range<Integer> squareFeet = new Range<Integer>();
    private Translated<String> summary = new Translated<String>();
    private Integer units;

    public Boolean getActive() {
        return this.active;
    }

    public String getApplicationFees() {
        return this.applicationFees;
    }

    public Double getBaths() {
        return this.baths;
    }

    public Integer getBeds() {
        return this.beds;
    }

    public Double getBrokerFee() {
        return this.brokerFee;
    }

    public Double getDeposit() {
        return this.deposit;
    }

    public String getFloorplanImage2d() {
        return this.floorplanImage2d;
    }

    public String getFloorplanImage3d() {
        return this.floorplanImage3d;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getImageFilename() {
        return this.imageFilename;
    }

    public String getInsideViewImage() {
        return this.insideViewImage;
    }

    public String getLeaseTerms() {
        return this.leaseTerms;
    }

    public String getModelFilename() {
        return this.modelFilename;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getPerBedPricing() {
        return this.perBedPricing;
    }

    public String getPhone() {
        return this.phone;
    }

    public Range<Integer> getPrice() {
        return this.price;
    }

    public Integer getRentableUnits() {
        return this.rentableUnits;
    }

    public String getRequestToHoldUrl() {
        return this.requestToHoldUrl;
    }

    public Range<Integer> getSquareFeet() {
        return this.squareFeet;
    }

    public Translated<String> getSummary() {
        return this.summary;
    }

    public Integer getUnits() {
        return this.units;
    }

    public Boolean isActive() {
        return this.active;
    }

    public Boolean isPerBedPricing() {
        return this.perBedPricing;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    public void setApplicationFees(final String applicationFees) {
        this.applicationFees = applicationFees;
    }

    public void setBaths(final Double baths) {
        this.baths = baths;
    }

    public void setBeds(final Integer beds) {
        this.beds = beds;
    }

    public void setBrokerFee(final Double brokerFee) {
        this.brokerFee = brokerFee;
    }

    public void setDeposit(final Double deposit) {
        this.deposit = deposit;
    }

    public void setFloorplanImage2d(final String floorplanImage2d) {
        this.floorplanImage2d = floorplanImage2d;
    }

    public void setFloorplanImage3d(final String floorplanImage3d) {
        this.floorplanImage3d = floorplanImage3d;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setImageFilename(final String imageFilename) {
        this.imageFilename = imageFilename;
    }

    public void setInsideViewImage(final String insideViewImage) {
        this.insideViewImage = insideViewImage;
    }

    public void setLeaseTerms(final String leaseTerms) {
        this.leaseTerms = leaseTerms;
    }

    public void setModelFilename(final String modelFilename) {
        this.modelFilename = modelFilename;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPerBedPricing(final Boolean perBedPricing) {
        this.perBedPricing = perBedPricing;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public void setPrice(final Range<Integer> price) {
        this.price = price;
    }

    public void setRentableUnits(final Integer rentableUnits) {
        this.rentableUnits = rentableUnits;
    }

    public void setRequestToHoldUrl(final String requestToHoldUrl) {
        this.requestToHoldUrl = requestToHoldUrl;
    }

    public void setSquareFeet(final Range<Integer> squareFeet) {
        this.squareFeet = squareFeet;
    }

    public void setSummary(final Translated<String> summary) {
        this.summary = summary;
    }

    public void setUnits(final Integer units) {
        this.units = units;
    }
}
