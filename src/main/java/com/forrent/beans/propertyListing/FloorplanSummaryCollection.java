package com.forrent.beans.propertyListing;

public class FloorplanSummaryCollection
{
    private FloorplanSummary all = new FloorplanSummary();
    private ObjectWithIdCollection<FloorplanSummary> byRooms = new ObjectWithIdCollection<FloorplanSummary>();

    /**
     * Summary of all floorplans.
     */
    public FloorplanSummary getAll() {
        return this.all;
    }

    /**
     * Summaries of floorplans, grouped by room count.
     */
    public ObjectWithIdCollection<FloorplanSummary> getByRooms() {
        return this.byRooms;
    }

    public void setAll(final FloorplanSummary all) {
        this.all = all;
    }

    public void setByRooms(final ObjectWithIdCollection<FloorplanSummary> byRooms) {
        this.byRooms = byRooms;
    }
}
