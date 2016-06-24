package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private List<Floorplan> floorplans;
    private FloorplanSummary floorplanSummary;
    private List<FloorplanSummary> floorplanSummaryByRoomCount;
    private List<Amenity> amenities;

    public List<Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public Floorplan getFloorplans(final Integer index) {
        return this.floorplans.get(index);
    }

    public FloorplanSummary getFloorplanSummary() {
        return this.floorplanSummary;
    }

    public List<FloorplanSummary> getFloorplanSummaryByRoomCount() {
        return this.floorplanSummaryByRoomCount;
    }

    public List<Amenity> getAmenities() {
        return this.amenities;
    }

    public Amenity getAmenities(final Integer index){
        return this.amenities.get(index);
    }

    public void setFloorplans(final List<Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummary(final FloorplanSummary floorplanSummary) {
        this.floorplanSummary = floorplanSummary;
    }

    public void setFloorplanSummaryByRoomCount(final List<FloorplanSummary> floorplanSummaryByRoomCount) {
        this.floorplanSummaryByRoomCount = floorplanSummaryByRoomCount;
    }

	public void setAmenities(final List<Amenity> amenities) {
		this.amenities = amenities;
	}
}
