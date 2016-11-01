package com.forrent.beans.propertyListing;

public class FeaturedListing implements IObjectWithId, IObjectWithType
{
    private String id;
    private TargetGeography targetGeo = new TargetGeography();
    private FeaturedListingType type;
    private String videoId;

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

    public String getVideoId() {
        return this.videoId;
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

    public void setVideoId(final String videoId) {
        this.videoId = videoId;
    }
}
