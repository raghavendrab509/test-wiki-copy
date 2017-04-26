package com.forrent.beans.propertyListing;

import com.forrent.beans.common.ObjectCollection;
import com.forrent.beans.common.ObjectWithIdCollection;

import java.io.Serializable;

/**
 * Information about the physical apartment building a listing is associated with.
 */
@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private ObjectWithIdCollection<Amenity> amenities = new ObjectWithIdCollection<>();
    private ObjectWithIdCollection<Floorplan> floorplans  = new ObjectWithIdCollection<>();
    private ObjectWithIdCollection<FloorplanSummary> floorplanSummaries = new ObjectWithIdCollection<>();
    private ObjectCollection<Spotlight> spotlights = new ObjectCollection<>();
    private Integer yearBuilt;
    private Integer yearRemodeled;

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

    public Integer getYearBuilt() {
        return this.yearBuilt;
    }

    public Integer getYearRemodeled() {
        return this.yearRemodeled;
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

    public void setYearBuilt(final Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setYearRemodeled(final Integer yearRemodeled) {
        this.yearRemodeled = yearRemodeled;
    }
}
