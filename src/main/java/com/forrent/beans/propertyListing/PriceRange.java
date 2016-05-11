package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PriceRange implements Serializable {
	private Integer high;
	private Integer low;
	
	public int getHigh() {
		return high;
	}
	
	public void setHigh(Integer high) {
		this.high = high;
	}
	
	public int getLow() {
		return low;
	}
	
	public void setLow(Integer low) {
		this.low = low;
	}
}