package com.forrent.beans.propertyListing;

/**
 * Information about a video resource.
 */
public class Video implements IObjectWithId
{
    public enum VideoFileType
    {
        MP4,
        POSTER,
        WEBM
    }

    /**
     * Id explaining the type of video. Each property may have
     * one of each.
     */
    public enum VideoId
    {
        AERIAL_VIDEO,
        COMMUNITY_THEATER_VIDEO,
        COMMUNITY_THEATER_VIDEO_ES(Locale.ES);

        private Locale locale;

        VideoId() {
            this.locale = Locale.EN;
        }

        VideoId(final Locale locale) {
            this.locale = locale;
        }

        public Locale getLocale() {
            return this.locale;
        }
    }

    private VideoId id;
    private Locale locale;
    private String mp4;
    private String poster;
    private String webm;

    public Video() {}

    public Video(final VideoId id) {
        this.id = id;
        this.locale = id.getLocale();
    }

    @Override
    public String getId() {
        return this.id.toString();
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getMp4() {
        return this.mp4;
    }

    public String getPoster() {
        return this.poster;
    }

    public String getWebm() {
        return this.webm;
    }

    public void setId(final VideoId id) {
        this.id = id;
        this.locale = id.getLocale();
    }

    public void setMp4(final String mp4) {
        this.mp4 = mp4;
    }

    public void setPoster(final String poster) {
        this.poster = poster;
    }

    public void setType(final VideoId id) {
        this.id = id;
    }

    public void setWebm(final String webm) {
        this.webm = webm;
    }
}
