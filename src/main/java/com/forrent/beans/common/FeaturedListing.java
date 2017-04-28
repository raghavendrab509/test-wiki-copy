package com.forrent.beans.common;

import java.util.List;

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
        private List<String> filterId;
        private String desktopImageFileName;
        private String mobileImageFileName;
        private String logoImageFileName;

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
            return this.filterType;
        }

        public void setFilterType(final String filterType)
        {
            this.filterType = filterType;
        }

        public List<String> getFilterId()
        {
            return this.filterId;
        }

        public void setFilterId(final List<String> filterId)
        {
            this.filterId = filterId;
        }

        public String getDesktopImageFileName()
        {
            return this.desktopImageFileName;
        }

        public void setDesktopImageFileName(final String imageFileName)
        {
            this.desktopImageFileName = imageFileName;
        }

        public String getMobileImageFileName()
        {
            return this.mobileImageFileName;
        }

        public void setMobileImageFileName(final String mobileImageFileName)
        {
            this.mobileImageFileName = mobileImageFileName;
        }

        public String getLogoImageFileName()
        {
            return this.logoImageFileName;
        }

        public void setLogoImageFileName(final String logoImageFileName)
        {
            this.logoImageFileName = logoImageFileName;
        }
    }
}
