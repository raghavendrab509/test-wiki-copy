package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private List<Floorplan> floorplans;
    private FloorplanSummary floorplanSummary;
    private Map<Integer, FloorplanSummary> floorplanSummaryByRoomCount;

    public List<Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public FloorplanSummary getFloorplanSummary() {
        return this.floorplanSummary;
    }

    public Map<Integer, FloorplanSummary> getFloorplanSummaryByRoomCount() {
        return this.floorplanSummaryByRoomCount;
    }

    public void setFloorplans(final List<Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummary(final FloorplanSummary floorplanSummary) {
        this.floorplanSummary = floorplanSummary;
    }

    public void setFloorplanSummaryByRoomCount(final Map<Integer, FloorplanSummary> floorplanSummaryByRoomCount) {
        this.floorplanSummaryByRoomCount = floorplanSummaryByRoomCount;
    }
}
