package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Detail implements Serializable {
	private Boolean paid;
	private int searchWeightFrc;
	private int searchWeightFrcEs;
	private int searchWeightFru;
	private int searchWeightFrcMobile;
	private int relativePerformanceScore;
	
	public Boolean getPaid() {
		return paid;
	}
	
	public void setPaid(final Boolean paid) {
		this.paid = paid;
	}
	
	public int getSearchWeightFrc() {
		return searchWeightFrc;
	}
	
	public void setSearchWeightFrc(final int searchWeightFrc) {
		this.searchWeightFrc = searchWeightFrc;
	}
	
	public int getSearchWeightFrcEs() {
		return searchWeightFrcEs;
	}
	
	public void setSearchWeightFrcEs(final int searchWeightES) {
		this.searchWeightFrcEs = searchWeightES;
	}
	
	public int getSearchWeightFru() {
		return searchWeightFru;
	}
	
	public void setSearchWeightFru(final int searchWeightFru) {
		this.searchWeightFru = searchWeightFru;
	}
	
	public int getSearchWeightFrcMobile() {
		return searchWeightFrcMobile;
	}
	
	public void setSearchWeightFrcMobile(final int searchWeightFrcMobile) {
		this.searchWeightFrcMobile = searchWeightFrcMobile;
	}
	
	public int getRelativePerformanceScore() {
		return relativePerformanceScore;
	}
	
	public void setRelativePerformanceScore(final int relativePerformanceScore) {
		this.relativePerformanceScore = relativePerformanceScore;
	}
}
