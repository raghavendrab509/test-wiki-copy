package com.forrent.beans.propertyListing;

public class AdCampaign
{
    private Integer adCampaignId;
    private String logo;
    private String headlineText;
    private String linkText;
    private String destinationURL;
    private String trackingPixel;
    private String color;
    
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeadlineText() {
        return headlineText;
    }

    public void setHeadlineText(String headlineText) {
        this.headlineText = headlineText;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getDestinationURL() {
        return destinationURL;
    }

    public void setDestinationURL(String destinationURL) {
        this.destinationURL = destinationURL;
    }

    public String getTrackingPixel() {
        return trackingPixel;
    }

    public void setTrackingPixel(String trackingPixel) {
        this.trackingPixel = trackingPixel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAdCampaignId() {
        return adCampaignId;
    }

    public void setAdCampaignId(Integer adCampaignId) {
        this.adCampaignId = adCampaignId;
    }
}
