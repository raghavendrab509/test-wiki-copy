package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyReview implements IObjectWithId,Serializable{

    private String id;
    private String publishDate;
    private String author;
    private String foundDate;
    private final Translated<String> snippet = new Translated<String>();
    private String key;
    private final Translated<String> title = new Translated<String>();
    private String sourceName;
    private String listingTag;
    private String link;
    private Double score;

    @Override
	public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(final String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getFoundDate() {
        return this.foundDate;
    }

    public void setFoundDate(final String foundDate) {
        this.foundDate = foundDate;
    }

    public Translated<String> getSnippet() {
        return this.snippet;
    }

    public void addSnippet(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.snippet.setEn(text);
        } else {
            this.snippet.setEs(text);
        }
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Translated<String> getTitle() {
        return this.title;
    }

    public void addTitle(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.title.setEn(text);
        } else {
            this.title.setEs(text);
        }
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public void setSourceName(final String sourceName) {
        this.sourceName = sourceName;
    }

    public String getListingTag() {
        return this.listingTag;
    }

    public void setListingTag(final String listingTag) {
        this.listingTag = listingTag;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(final Double score) {
        this.score = score;
    }
}
