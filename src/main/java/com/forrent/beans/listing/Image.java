package com.forrent.beans.listing;

import java.net.URL;

public class Image
{
    private String caption;
    private String fileName;
    private URL largeUrl;
    private URL smallUrl;

    public String getCaption() {
        return this.caption;
    }

    public String getFileName() {
        return this.fileName;
    }

    public URL getLargeUrl() {
        return this.largeUrl;
    }

    public URL getSmallUrl() {
        return this.smallUrl;
    }

    public void setCaption(final String caption) {
        this.caption = caption;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setLargeUrl(final URL largeUrl) {
        this.largeUrl = largeUrl;
    }

    public void setSmallUrl(final URL smallUrl) {
        this.smallUrl = smallUrl;
    }
}
