package com.forrent.beans.propertyListing;

import com.forrent.beans.common.Locale;

public class Spotlight {

    private String image;
    private String imagePath;
    private String imageName;
    private String coupon;
    private final Translated<String> spotlightText = new Translated<String>();
    private Boolean isCustom;

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

    public Translated<String> getSpotlightText() {
        return this.spotlightText;
    }

    public void addSpotlightText(final String text, final String locale)
    {
        if (Locale.valueOf(locale) == Locale.EN) {
            this.spotlightText.setEn(text);
        } else {
            this.spotlightText.setEs(text);
        }
    }

    public Boolean getIsCustom() {
        return this.isCustom;
    }

    public void setIsCustom(final Boolean isCustom) {
        this.isCustom = isCustom;
    }

}
