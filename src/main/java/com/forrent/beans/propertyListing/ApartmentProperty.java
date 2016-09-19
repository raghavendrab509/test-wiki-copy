package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private ObjectWithIdCollection<Amenity> amenities = new ObjectWithIdCollection<Amenity>();
    private ObjectWithIdCollection<Floorplan> floorplans  = new ObjectWithIdCollection<Floorplan>();
    private ObjectWithIdCollection<FloorplanSummary> floorplanSummaries = new ObjectWithIdCollection<FloorplanSummary>();
    private ObjectCollection<Spotlight> spotlights = new ObjectCollection<Spotlight>();

    public ObjectWithIdCollection<Amenity> getAmenities() {
        return this.amenities;
    }

    public ObjectWithIdCollection<Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public ObjectWithIdCollection<FloorplanSummary> getFloorplanSummaries() {
        return this.floorplanSummaries;
    }

    public ObjectCollection<Spotlight> getSpotlights() {
        return this.spotlights;
    }

    public void setAmenities(final ObjectWithIdCollection<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void setFloorplans(final ObjectWithIdCollection<Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummaries(final ObjectWithIdCollection<FloorplanSummary> floorplanSummary) {
        this.floorplanSummaries = floorplanSummary;
    }

    public void setSpotlights(final ObjectCollection<Spotlight> spotlights) {
        this.spotlights = spotlights;
    }
}
