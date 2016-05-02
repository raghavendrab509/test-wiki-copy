package com.forrent.beans.listing;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class ApartmentProperty implements Serializable
{
    private Map<String, Floorplan> floorplans;
    private FloorplanSummary floorplanSummary;
    private Map<Integer, FloorplanSummary> floorplanSummaryByRoomCount;
    private Map<String, Image> images;

    public Map<String, Floorplan> getFloorplans() {
        return this.floorplans;
    }

    public FloorplanSummary getFloorplanSummary() {
        return this.floorplanSummary;
    }

    public Map<Integer, FloorplanSummary> getFloorplanSummaryByRoomCount() {
        return this.floorplanSummaryByRoomCount;
    }

    public Map<String, Image> getImages() {
        return images;
    }

    public void setFloorplans(final Map<String, Floorplan> floorplans) {
        this.floorplans = floorplans;
    }

    public void setFloorplanSummary(final FloorplanSummary floorplanSummary) {
        this.floorplanSummary = floorplanSummary;
    }

    public void setFloorplanSummaryByRoomCount(final Map<Integer, FloorplanSummary> floorplanSummaryByRoomCount) {
        this.floorplanSummaryByRoomCount = floorplanSummaryByRoomCount;
    }

    public void setImages(Map<String, Image> images) {
        this.images = images;
    }
}
