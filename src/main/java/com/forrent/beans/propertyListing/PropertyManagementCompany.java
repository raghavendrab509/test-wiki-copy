package com.forrent.beans.propertyListing;

import com.forrent.beans.common.IObjectWithId;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyManagementCompany implements IObjectWithId, Serializable {

	private String id;
	private String name;
	private String url;
	private String type;
	private Integer listingCount;

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

	public Integer getListingCount() {
		return this.listingCount;
	}

	public void setListingCount(final Integer listingCount) {
		this.listingCount = listingCount;
	}

}
