package com.forrent.beans.geography;

/**
 * Levels of the geography hierarchy.
 */
public enum GeoType
{
    AREA(3, false),
    CITY(4, false),
    COUNTRY(0, true),
    INSTITUTION(5, false),
    METRO(2, true),

    NEIGHBORHOOD(5, false),
    SCHOOL(5, false),
    STATE(1, true),
    ZIP(5, true);

    /**
     * Level of depth in hierarchy of geographic entities (relative to other entities).
     * Geographic types with a larger depth are contained within types with a smaller depth.
     *
     * For example, a NEIGHBORHOOD (5) is within a CITY (4) which is with a STATE (1).
     *
     * This number should only be used for relative comparison of GeoTypes, it is subject
     * to change as types are added and removed.
     */
    private final Integer depth;

    /**
     * Can GeoEntities of this type be identified by their name alone.
     *
     * For example, METROs have unique names, so I can find "Hampton Roads" without knowing
     * what state it is in. CITIES do not have unique names, so to find the city "Norfolk",
     * I must know what state it is in.
     */
    private final Boolean hasUniqueName;

    GeoType(final Integer depth, final Boolean hasUniqueName)
    {
        this.depth = depth;
        this.hasUniqueName = hasUniqueName;
    }

    public Boolean hasUniqueName() {
        return this.hasUniqueName;
    }

    /**
     * Can this type be found within the type CITY?
     */
    public Boolean isBelowCityDepth() {
        return this.depth > CITY.getDepth();
    }

    /**
     * Can this type be found within the type STATE?
     */
    public Boolean isBelowStateDepth() {
        return this.depth > STATE.getDepth();
    }

    public String toLowerCase() {
        return this.toString().toLowerCase();
    }

    private Integer getDepth() {
        return this.depth;
    }
}
