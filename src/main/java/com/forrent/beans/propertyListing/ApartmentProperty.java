package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private ObjectWithIdCollection<Amenity> amenities = new ObjectWithIdCollection<Amenity>();
    private ObjectWithIdCollection<Floorplan> floorplans  = new ObjectWithIdCollection<Floorplan>();
    private FloorplanSummaryCollection floorplanSummary = new FloorplanSummaryCollection();

    public ObjectWithIdCollection<Amenity> getAmenities() {
        return this.amenities;
    }

    public ObjectWithIdCollection<Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public FloorplanSummaryCollection getFloorplanSummary() {
        return this.floorplanSummary;
    }

    public void setAmenities(final ObjectWithIdCollection<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void setFloorplans(final ObjectWithIdCollection<Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummary(final FloorplanSummaryCollection floorplanSummary) {
        this.floorplanSummary = floorplanSummary;
    }
}
