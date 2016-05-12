package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Floorplan implements Serializable
{
	private Integer id;
	private String name;
	private SquareFeet squareFeet;
	private PriceRange price;
	private Integer beds;
	private Double baths;
	private String imageFilename;
	private String modelFilename;
	private String text;
	private String applicationFees;
	private String deposit;
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

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public SquareFeet getSquareFeet() {
		return squareFeet;
	}
	
	public void setSquareFeet(SquareFeet squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public PriceRange getPrice() {
		return price;
	}
	
	public void setPrice(PriceRange price) {
		this.price = price;
	}
	
	public int getBeds() {
		return beds;
	}
	
	public void setBeds(Integer beds) {
		this.beds = beds;
	}
	
	public Double getBaths() {
		return baths;
	}
	
	public void setBaths(Double baths) {
		this.baths = baths;
	}
	
	public String getImageFilename() {
		return imageFilename;
	}

	public void setImageFilename(String imageFilename) {
		this.imageFilename = imageFilename;
	}

	public String getModelFilename() {
		return modelFilename;
	}

	public void setModelFilename(String modelFilename) {
		this.modelFilename = modelFilename;
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getApplicationFees() {
		return applicationFees;
	}
	
	public void setApplicationFees(String applicationFees) {
		this.applicationFees = applicationFees;
	}
	
	public String getDeposit() {
		return deposit;
	}
	
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	
	public String getLeaseTerms() {
		return leaseTerms;
	}
	
	public void setLeaseTerms(String leaseTerms) {
		this.leaseTerms = leaseTerms;
	}
	
	public int getUnits() {
		return units;
	}
	
	public void setUnits(Integer units) {
		this.units = units;
	}
	
	public int getRentableUnits() {
		return rentableUnits;
	}
	
	public void setRentableUnits(Integer rentableUnits) {
		this.rentableUnits = rentableUnits;
	}
	
	public Double getBrokerFee() {
		return brokerFee;
	}
	
	public void setBrokerFee(Double brokerFee) {
		this.brokerFee = brokerFee;
	}
	
	public Boolean isPerBedPricing() {
		return perBedPricing;
	}
	
	public void setPerBedPricing(Boolean perBedPricing) {
		this.perBedPricing = perBedPricing;
	}
	
	public String getRequestToHoldUrl() {
		return requestToHoldUrl;
	}
	
	public void setRequestToHoldUrl(String requestToHoldUrl) {
		this.requestToHoldUrl = requestToHoldUrl;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getFloorplanImage2d() {
		return floorplanImage2d;
	}
	
	public void setFloorplanImage2d(String floorplanImage2d) {
		this.floorplanImage2d = floorplanImage2d;
	}
	
	public String getFloorplanImage3d() {
		return floorplanImage3d;
	}
	
	public void setFloorplanImage3d(String floorplanImage3d) {
		this.floorplanImage3d = floorplanImage3d;
	}
	
	public String getInsideViewImage() {
		return insideViewImage;
	}
	
	public void setInsideViewImage(String insideViewImage) {
		this.insideViewImage = insideViewImage;
	}
}
