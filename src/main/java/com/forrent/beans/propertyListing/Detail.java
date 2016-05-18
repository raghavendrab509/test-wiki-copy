package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Detail implements Serializable {
	private Boolean paid;
	private Integer searchWeightFrc;
	private Integer searchWeightFrcEs;
	private Integer searchWeightFru;
	private Integer searchWeightFrcMobile;
	private Integer relativePerformanceScore;
	
	public Boolean getPaid() {
		return paid;
	}
	
	public void setPaid(final Boolean paid) {
		this.paid = paid;
	}
	
	public Integer getSearchWeightFrc() {
		return searchWeightFrc;
	}
	
	public void setSearchWeightFrc(final Integer searchWeightFrc) {
		this.searchWeightFrc = searchWeightFrc;
	}
	
	public Integer getSearchWeightFrcEs() {
		return searchWeightFrcEs;
	}
	
	public void setSearchWeightFrcEs(final Integer searchWeightES) {
		this.searchWeightFrcEs = searchWeightES;
	}
	
	public Integer getSearchWeightFru() {
		return searchWeightFru;
	}
	
	public void setSearchWeightFru(final Integer searchWeightFru) {
		this.searchWeightFru = searchWeightFru;
	}
	
	public Integer getSearchWeightFrcMobile() {
		return searchWeightFrcMobile;
	}
	
	public void setSearchWeightFrcMobile(final Integer searchWeightFrcMobile) {
		this.searchWeightFrcMobile = searchWeightFrcMobile;
	}
	
	public Integer getRelativePerformanceScore() {
		return relativePerformanceScore;
	}
	
	public void setRelativePerformanceScore(final Integer relativePerformanceScore) {
		this.relativePerformanceScore = relativePerformanceScore;
	}
}
