package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Amenity implements Serializable {
	private String category;
	private String searchableCategory;
	private String websiteCode;
	private Boolean searchable;
	private String name;
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(final String category) {
		this.category = category;
	}
	
	public String getSearchableCategory() {
		return searchableCategory;
	}
	
	public void setSearchableCategory(final String searchableCategory) {
		this.searchableCategory = searchableCategory;
	}
	
	public String getWebsiteCode() {
		return websiteCode;
	}
	
	public void setWebsiteCode(final String websiteCode) {
		this.websiteCode = websiteCode;
	}
	
	public Boolean getSearchable() {
		return searchable;
	}
	
	public void setSearchable(final Boolean searchable) {
		this.searchable = searchable;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
}
