package com.forrent.beans.common;

public class FeaturedListing implements IObjectWithId, IObjectWithType
{
    private String id;
    private TargetGeography targetGeo = new TargetGeography();
    private FeaturedListingType type;
    private OptionalFields optionalFields;

    @Override
    public String getId() {
        return this.id;
    }

    public TargetGeography getTargetGeo() {
        return this.targetGeo;
    }

    @Override
    public String getType() {
        return this.type.toString();
    }

    public OptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTargetGeo(final TargetGeography targetGeo) {
        this.targetGeo = targetGeo;
    }

    public void setType(final FeaturedListingType type) {
        this.type = type;
    }

    public void setOptionalFields(final OptionalFields optionalFields) {
        this.optionalFields = optionalFields;
    }

    public class OptionalFields {

        private String videoId;
        private String headline;
        private String filterType;
        private String filterId;

        public String getVideoId() {
            return this.videoId;
        }

        public void setVideoId(final String videoId) {
            this.videoId = videoId;
        }

        public String getHeadline()
        {
            return this.headline;
        }

        public void setHeadline(final String headline)
        {
            this.headline = headline;
        }

        public String getFilterType()
        {
            return filterType;
        }

        public void setFilterType(String filterType)
        {
            this.filterType = filterType;
        }

        public String getFilterId()
        {
            return filterId;
        }

        public void setFilterId(String filterId)
        {
            this.filterId = filterId;
        }
    }
}
