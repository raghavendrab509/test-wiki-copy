package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Neighborhood  implements Serializable {

	private String neighborhoodId;
	private String name;
	
	public String getNeighborhoodId() {
		return neighborhoodId;
	}
	public void setNeighborhoodId(String neighborhoodId) {
		this.neighborhoodId = neighborhoodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
