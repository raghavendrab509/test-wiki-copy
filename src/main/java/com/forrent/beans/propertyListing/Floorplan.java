package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Floorplan implements Serializable
{
	private Integer id;
	private String name;
	private Range<Integer> squareFeet;
	private Range<Integer> price;
	private Integer beds;
	private Double baths;
	private String imageFilename;
	private String modelFilename;
	private String text;
	private String applicationFees;
	private Double deposit;
	private String leaseTerms;
	private Integer units;
	private Integer rentableUnits;
	private Double brokerFee;
	private Boolean perBedPricing;
	private String requestToHoldUrl;
	private String summary;
	private String phone;
	private String floorplanImage2d;
	private String floorplanImage3d;
	private String insideViewImage;
	private Boolean active;
	
	public Boolean isActive() {
		return active;
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(final Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public Range<Integer> getSquareFeet() {
		return squareFeet;
	}
	
	public void setSquareFeet(final Range<Integer> squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public Range<Integer> getPrice() {
		return price;
	}
	
	public void setPrice(final Range<Integer> price) {
		this.price = price;
	}
	
	public Integer getBeds() {
		return beds;
	}
	
	public void setBeds(final Integer beds) {
		this.beds = beds;
	}
	
	public Double getBaths() {
		return baths;
	}
	
	public void setBaths(final Double baths) {
		this.baths = baths;
	}
	
	public String getImageFilename() {
		return imageFilename;
	}

	public void setImageFilename(final String imageFilename) {
		this.imageFilename = imageFilename;
	}

	public String getModelFilename() {
		return modelFilename;
	}

	public void setModelFilename(final String modelFilename) {
		this.modelFilename = modelFilename;
	}

	public String getText() {
		return text;
	}
	
	public void setText(final String text) {
		this.text = text;
	}
	
	public String getApplicationFees() {
		return applicationFees;
	}
	
	public void setApplicationFees(final String applicationFees) {
		this.applicationFees = applicationFees;
	}
	
	public Double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(final Double deposit) {
		this.deposit = deposit;
	}
	
	public String getLeaseTerms() {
		return leaseTerms;
	}
	
	public void setLeaseTerms(final String leaseTerms) {
		this.leaseTerms = leaseTerms;
	}
	
	public Integer getUnits() {
		return units;
	}
	
	public void setUnits(final Integer units) {
		this.units = units;
	}
	
	public Integer getRentableUnits() {
		return rentableUnits;
	}
	
	public void setRentableUnits(final Integer rentableUnits) {
		this.rentableUnits = rentableUnits;
	}
	
	public Double getBrokerFee() {
		return brokerFee;
	}
	
	public void setBrokerFee(final Double brokerFee) {
		this.brokerFee = brokerFee;
	}
	
	public Boolean isPerBedPricing() {
		return perBedPricing;
	}
	
	public void setPerBedPricing(final Boolean perBedPricing) {
		this.perBedPricing = perBedPricing;
	}
	
	public String getRequestToHoldUrl() {
		return requestToHoldUrl;
	}
	
	public void setRequestToHoldUrl(final String requestToHoldUrl) {
		this.requestToHoldUrl = requestToHoldUrl;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(final String summary) {
		this.summary = summary;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	
	public String getFloorplanImage2d() {
		return floorplanImage2d;
	}
	
	public void setFloorplanImage2d(final String floorplanImage2d) {
		this.floorplanImage2d = floorplanImage2d;
	}
	
	public String getFloorplanImage3d() {
		return floorplanImage3d;
	}
	
	public void setFloorplanImage3d(final String floorplanImage3d) {
		this.floorplanImage3d = floorplanImage3d;
	}
	
	public String getInsideViewImage() {
		return insideViewImage;
	}
	
	public void setInsideViewImage(final String insideViewImage) {
		this.insideViewImage = insideViewImage;
	}
}
