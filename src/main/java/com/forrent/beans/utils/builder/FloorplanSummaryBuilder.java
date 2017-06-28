package com.forrent.beans.utils.builder;

import com.forrent.beans.common.ObjectWithIdCollection;
import com.forrent.beans.propertyListing.Floorplan;
import com.forrent.beans.propertyListing.FloorplanSummary;
import com.forrent.beans.propertyListing.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FloorplanSummaryBuilder
{
    public ObjectWithIdCollection<FloorplanSummary> buildCollection(final ObjectWithIdCollection<Floorplan> floorplans)
    {
        final ObjectWithIdCollection<FloorplanSummary> collection = new ObjectWithIdCollection<FloorplanSummary>();

        collection.put(this.buildSummary(FloorplanSummary.ALL_ID, floorplans.getContent()));
        collection.putAll(this.buildByRoomCount(floorplans.getContent()));

        return collection;
    }

    public FloorplanSummary buildSummary(final String rooms, final List<Floorplan> floorplans)
    {
        final FloorplanSummary floorplanSummary = new FloorplanSummary();

        floorplanSummary.setId(rooms);
        floorplanSummary.setBeds(this.buildBedroomsRange(floorplans));
        floorplanSummary.setBaths(this.buildBathroomsRange(floorplans));
        floorplanSummary.setPrice(this.buildPricesRange(floorplans));
        floorplanSummary.setSquareFeet(this.buildSquareFeetRange(floorplans));
        floorplanSummary.setHasPerBedPricing(this.determinePerBedPricing(floorplans));
        floorplanSummary.setNumberOfAvailableUnits(this.getNumberOfAvailableUnits(floorplans));

        return floorplanSummary;
    }

    public Range<Integer> buildBedroomsRange(final List<Floorplan> floorplans)
    {
        Integer low = null;
        Integer high = null;

        if (floorplans.isEmpty()) {
            return new Range<Integer>();
        } else {
            for (final Floorplan floorplan : floorplans) {
                if (floorplan.getBeds() != null && floorplan.getBeds() >= 0) {
                    // Check low
                    if (low == null || floorplan.getBeds() < low) {
                        low = floorplan.getBeds();
                    }
                    // Check high
                    if (high == null || floorplan.getBeds() > high) {
                        high = floorplan.getBeds();
                    }
                }
            }

            if (low == null && high != null) {
                low = high;
            }
            if (low != null && high == null) {
                high = low;
            }

            return new Range<Integer>(low, high);
        }
    }

    public Range<Double> buildBathroomsRange(final List<Floorplan> floorplans)
    {
        Double low = null;
        Double high = null;

        if (floorplans.isEmpty()) {
            return new Range<Double>();
        } else {
            for (final Floorplan floorplan : floorplans) {
                if (floorplan.getBaths() != null && floorplan.getBaths() >= 0) {
                    // Check low
                    if (low == null || floorplan.getBaths() < low) {
                        low = floorplan.getBaths();
                    }
                    // Check high
                    if (high == null || floorplan.getBaths() > high) {
                        high = floorplan.getBaths();
                    }
                }
            }

            if (low == null && high != null) {
                low = high;
            }
            if (low != null && high == null) {
                high = low;
            }

            return new Range<Double>(low, high);
        }
    }

    public Range<Integer> buildPricesRange(final List<Floorplan> floorplans)
    {
        Integer low = null;
        Integer high = null;

        if (floorplans.isEmpty()) {
            return new Range<Integer>();
        } else {
            for (final Floorplan floorplan : floorplans) {
                // Check low
                if (floorplan.getPrice().getLow() != null && floorplan.getPrice().getLow().intValue() >= 0) {
                    if (low == null || floorplan.getPrice().getLow() < low) {
                        low = floorplan.getPrice().getLow();
                    }
                }
                // Check high
                if (floorplan.getPrice().getHigh() != null && floorplan.getPrice().getHigh().intValue() >= 0) {
                    if (high == null || floorplan.getPrice().getHigh() > high) {
                        high = floorplan.getPrice().getHigh();
                    }
                }
            }

            if (low == null && high != null) {
                low = high;
            }
            if (low != null && high == null) {
                high = low;
            }

            return new Range<Integer>(low, high);
        }
    }

    public Range<Integer> buildSquareFeetRange(final List<Floorplan> floorplans)
    {
        Integer low = null;
        Integer high = null;

        if (floorplans.isEmpty()) {
            return new Range<Integer>();
        } else {
            for (final Floorplan floorplan : floorplans) {
                // Check low
                if (floorplan.getSquareFeet().getLow() != null && floorplan.getSquareFeet().getLow().intValue() >= 0) {
                    if (low == null || floorplan.getSquareFeet().getLow() < low) {
                        low = floorplan.getSquareFeet().getLow();
                    }
                }
                // Check high
                if (floorplan.getSquareFeet().getHigh() != null && floorplan.getSquareFeet().getHigh().intValue() >= 0) {
                    if (high == null || floorplan.getSquareFeet().getHigh() > high) {
                        high = floorplan.getSquareFeet().getHigh();
                    }
                }
            }

            if (low == null && high != null) {
                low = high;
            }
            if (low != null && high == null) {
                high = low;
            }

            return new Range<Integer>(low, high);
        }
    }

    public List<FloorplanSummary> buildByRoomCount(final List<Floorplan> floorplans)
    {
        final List<FloorplanSummary> byRoomCount = new ArrayList<FloorplanSummary>();

        final TreeSet<Integer> counts = this.getRoomCounts(floorplans);

        for (final Integer count : counts) {
            byRoomCount.add(this.buildSummary(count.toString(), this.filterByRoomCount(count, floorplans)));
        }

        return byRoomCount;
    }

    public TreeSet<Integer> getRoomCounts(final List<Floorplan> floorplans)
    {
        final TreeSet<Integer> counts = new TreeSet<Integer>();

        for (final Floorplan floorplan : floorplans) {
            if (floorplan.getBeds() != null) {
                counts.add(floorplan.getBeds());
            }
        }

        return counts;
    }

    public List<Floorplan> filterByRoomCount(final Integer roomCount, final List<Floorplan> floorplans)
    {
        final List<Floorplan> byRoomCount = new ArrayList<Floorplan>();

        for (final Floorplan floorplan : floorplans) {
            if (floorplan.getBeds() != null && floorplan.getBeds() == roomCount) {
                byRoomCount.add(floorplan);
            }
        }

        return byRoomCount;
    }

    private boolean determinePerBedPricing(final List<Floorplan> floorplans)
    {
        boolean hasPerBedPricing = false;

        for (final Floorplan floorplan : floorplans) {
            if (floorplan.getPerBedPricing() != null && floorplan.getPerBedPricing()) {
                hasPerBedPricing = true;
                break;
            }
        }

        return hasPerBedPricing;
    }

    private Integer getNumberOfAvailableUnits(final List<Floorplan> floorplans)
    {
        Integer numberOfAvailableUnits = 0;

        for (final Floorplan floorplan : floorplans) {
            final Integer rentableUnits = floorplan.getRentableUnits() == null ? 0 : floorplan.getRentableUnits();
            numberOfAvailableUnits = rentableUnits  + numberOfAvailableUnits;
        }

        return numberOfAvailableUnits;
    }
}
