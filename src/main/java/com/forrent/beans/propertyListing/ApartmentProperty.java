package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private List<Amenity> amenities = new ArrayList<Amenity>();
    private List<Floorplan> floorplans  = new ArrayList<Floorplan>();
    private FloorplanSummaryCollection floorplanSummary = new FloorplanSummaryCollection();

    public List<Amenity> getAmenities() {
        return this.amenities;
    }

    public Amenity getAmenities(final Integer index){
        return this.amenities.get(index);
    }

    public List<Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public Floorplan getFloorplans(final Integer index) {
        return this.floorplans.get(index);
    }

    public FloorplanSummaryCollection getFloorplanSummary() {
        return this.floorplanSummary;
    }

    public void setAmenities(final List<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void setFloorplans(final List<Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummary(final FloorplanSummaryCollection floorplanSummary) {
        this.floorplanSummary = floorplanSummary;
    }
}
