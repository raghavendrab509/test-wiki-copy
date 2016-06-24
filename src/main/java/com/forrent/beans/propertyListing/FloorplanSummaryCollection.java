package com.forrent.beans.propertyListing;

import java.util.List;

public class FloorplanSummaryCollection
{
    /**
     * Summary of all floorplans.
     */
    private FloorplanSummary all;

    /**
     * Summaries of floorplans, grouped by room count.
     */
    private List<FloorplanSummary> byRooms;

    public FloorplanSummary getAll() {
        return this.all;
    }

    public List<FloorplanSummary> getByRooms() {
        return this.byRooms;
    }

    public void setAll(final FloorplanSummary all) {
        this.all = all;
    }

    public void setByRooms(final List<FloorplanSummary> byRooms) {
        this.byRooms = byRooms;
    }
}
