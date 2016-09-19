package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.List;

public class Spotlight {

    private String image;
    private String imagePath;
    private String imageName;
    private String coupon;
    private Translated<List<String>> spotlightText;
    private Boolean isCustom;

    public Spotlight() {
        this.spotlightText.setEn(new ArrayList<String>());
        this.spotlightText.setEs(new ArrayList<String>());
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(final String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(final String imageName) {
        this.imageName = imageName;
    }

    public String getCoupon() {
        return this.coupon;
    }

    public void setCoupon(final String coupon) {
        this.coupon = coupon;
    }

    public Translated<List<String>> getSpotlightText() {
        return this.spotlightText;
    }

    public void addSpotlightText(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.spotlightText.getEn().add(text);
        } else {
            this.spotlightText.getEs().add(text);
        }
    }

    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public void setIsCustom(final Boolean isCustom) {
        this.isCustom = isCustom;
    }

}
