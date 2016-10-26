package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyReview implements IObjectWithId,Serializable{

    private String id;
    private String publishDate;
    private String author;
    private String foundDate;
    private String snippet;
    private String key;
    private String title;
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

    public String getSnippet() {
        return this.snippet;
    }

    public void setSnippet(final String snippet) {
        this.snippet = snippet;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
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
