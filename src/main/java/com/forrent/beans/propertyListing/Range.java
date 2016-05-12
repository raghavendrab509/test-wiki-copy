package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Range<T> implements Serializable {
	private T high;
	private T low;
	
	public Range(T low, T high) {
		this.low = low;
		this.high = high;
	}
	
	public Range() {}

	public T getHigh() {
		return high;
	}
	
	public void setHigh(T high) {
		this.high = high;
	}
	
	public T getLow() {
		return low;
	}
	
	public void setLow(T low) {
		this.low = low;
	}
}