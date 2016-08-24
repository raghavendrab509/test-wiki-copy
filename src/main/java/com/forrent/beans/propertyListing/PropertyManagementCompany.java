package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyManagementCompany implements IObjectWithId, Serializable {

	private String id;
	private String name;
	private String url;
	private String type;
	private String listingCount;

	@Override
	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getListingCount() {
		return this.listingCount;
	}

	public void setListingCount(final String listingCount) {
		this.listingCount = listingCount;
	}

}