package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SquareFeet implements Serializable {
	private Integer low;
	private Integer high;
	
	public int getLow() {
		return low;
	}
	
	public void setLow(Integer low) {
		this.low = low;
	}
	
	public int getHigh() {
		return high;
	}
	
	public void setHigh(Integer high) {
		this.high = high;
	}
}
