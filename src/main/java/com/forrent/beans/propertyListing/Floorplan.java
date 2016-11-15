package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Floorplan implements IObjectWithId, Serializable
{
    private String id;
    private String name;
    private Boolean active;
    private String applicationFees;
    private Double baths;
    private Integer beds;
    private Double brokerFee;
    private Double deposit;
    private String leaseTerms;
    private Boolean perBedPricing;
    private String phone;
    private Range<Integer> price = new Range<Integer>();
    private Integer rentableUnits;
    private String requestToHoldUrl;
    private Range<Integer> squareFeet = new Range<Integer>();
    private Translated<String> summary = new Translated<String>();
    private Integer units;
    private String image2d;
    private String image3d;
    private String imageModel;
    private String imageInsideView;
    private String imageRoomPlanner;

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

    @Override
    public String getId() {
        return this.id;
    }

    public String getLeaseTerms() {
        return this.leaseTerms;
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

    public String getImage2d()
    {
        return this.image2d;
    }

    public String getImage3d()
    {
        return this.image3d;
    }

    public String getImageModel()
    {
        return this.imageModel;
    }

    public String getImageInsideView()
    {
        return this.imageInsideView;
    }

    public String getImageRoomPlanner()
    {
        return this.imageRoomPlanner;
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

    public void setId(final String id) {
        this.id = id;
    }

    public void setLeaseTerms(final String leaseTerms) {
        this.leaseTerms = leaseTerms;
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

    public void setImage2d(final String image2d)
    {
        this.image2d = image2d;
    }

    public void setImage3d(final String image3d)
    {
        this.image3d = image3d;
    }

    public void setImageModel(final String imageModel)
    {
        this.imageModel = imageModel;
    }

    public void setImageInsideView(final String imageInsideView)
    {
        this.imageInsideView = imageInsideView;
    }

    public void setImageRoomPlanner(final String imageRoomPlanner)
    {
        this.imageRoomPlanner = imageRoomPlanner;
    }
}
