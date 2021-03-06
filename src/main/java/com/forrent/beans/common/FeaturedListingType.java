package com.forrent.beans.common;

public enum FeaturedListingType
{
    AD_PROSPECTOR,
    CITY_SHOWCASE_FRC,
    COMMUNITY_SPOTLIGHT,
    FEATURED_PROPERTY_FRC,
    FEATURED_PROPERTY_FRU,
    HERO_VIDEO,
    MARQUEE,
    MARQUEE_FRU,
    MOBILE_EXCLUSIVE,
    MOBILE_SELECT,
    PREFERRED,
    TICKER_AD_FRC;

    /**
     * Create from DB key.
     *
     * @param key Key
     * @return FeaturedListingType
     * @throws Exception Throws java.lang.Exception
     */
    public static FeaturedListingType fromKey(final String key)
            throws Exception
    {
        if (key == null) {
            throw new Exception("Key may not be null.");
        }

        switch (key.toLowerCase())
        {
            case "adprospector":
                return AD_PROSPECTOR;

            case "cityshowcase":
                return CITY_SHOWCASE_FRC;

            case "community_spotlight":
                return COMMUNITY_SPOTLIGHT;

            case "frc featured property":
                return FEATURED_PROPERTY_FRC;

            case "frc ticker ad":
                return TICKER_AD_FRC;

            case "frufeatprop":
                return FEATURED_PROPERTY_FRU;

            case "frumarquee":
                return MARQUEE_FRU;

            case "herovideo":
                return HERO_VIDEO;

            case "marquee":
                return MARQUEE;

            case "moblexcl":
                return MOBILE_EXCLUSIVE;

            case "moblsel":
                return MOBILE_SELECT;

            case "preferred_ad":
                return PREFERRED;

            default:
                throw new Exception("Could not create enum FeaturedListingType key: " + key);
        }
    }
}
