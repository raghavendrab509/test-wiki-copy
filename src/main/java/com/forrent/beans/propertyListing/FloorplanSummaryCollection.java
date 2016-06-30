package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.List;

public class FloorplanSummaryCollection
{
    private FloorplanSummary all = new FloorplanSummary();
    private List<FloorplanSummary> byRooms = new ArrayList<FloorplanSummary>();

    /**
     * Summary of all floorplans.
     */
    public FloorplanSummary getAll() {
        return this.all;
    }

    /**
     * Summaries of floorplans, grouped by room count.
     */
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
