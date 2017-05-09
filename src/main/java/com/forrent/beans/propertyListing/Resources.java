package com.forrent.beans.propertyListing;

import com.forrent.beans.common.ObjectWithIdCollection;

/**
 * Collection of web resources related to this property. Ideally `images` would
 * be included here, along with any other resource types we may need in the future.
 */
public class Resources
{
    private ObjectWithIdCollection<Video> videos = new ObjectWithIdCollection<>();

    public void setVideos(final ObjectWithIdCollection<Video> videos) {
        this.videos = videos;
    }

    public ObjectWithIdCollection<Video> getVideos() {
        return this.videos;
    }
}
