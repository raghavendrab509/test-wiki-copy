package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PropertyReviewsCollection  extends ObjectWithIdCollection<PropertyReview> implements Serializable{

    private Double averageRating;

    public Double getAverageRating() {
        return this.averageRating;
	}

    public void setAverageRating(final Double averageRating) {
        this.averageRating = averageRating;
    }

}
