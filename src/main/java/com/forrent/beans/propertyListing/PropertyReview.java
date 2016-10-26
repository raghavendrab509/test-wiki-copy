package com.forrent.beans.propertyListing;

public class PropertyReview {

    private Double averageRating;
    private final ObjectCollection<ReviewContent> content = new ObjectCollection<ReviewContent>();

    public Double getAverageRating() {
        return this.averageRating;
	}

    public void setAverageRating(final Double averageRating) {
        this.averageRating = averageRating;
    }

    public ObjectCollection<ReviewContent> getContent() {
        return this.content;
    }

}
