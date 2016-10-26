package com.forrent.beans.propertyListing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Detail implements Serializable
{
    private Boolean paid;
    private Integer searchWeightFrc;
    private Integer searchWeightFrcEs;
    private Integer searchWeightFru;
    private Integer searchWeightFrcMobile;
    private Integer relativePerformanceScore;
    private String vanityUrl;
    private String facebookId;
    private List<Product> products = new ArrayList<Product>();
    private Boolean hasSpecials;
    private Boolean hasVerizonFios;
    private Boolean hasBrokerFees;
    private List<Locale> translations = new ArrayList<>();
    private Boolean hasVideo;
    private Boolean hasAerialVideo;
    private PropertyManagementCompany pmc;
    private GuestCard guestCard;

    public Boolean getPaid() {
        return this.paid;
    }

    public void setPaid(final Boolean paid) {
        this.paid = paid;
    }

    public Integer getSearchWeightFrc() {
        return this.searchWeightFrc;
    }

    public void setSearchWeightFrc(final Integer searchWeightFrc) {
        this.searchWeightFrc = searchWeightFrc;
    }

    public Integer getSearchWeightFrcEs() {
        return this.searchWeightFrcEs;
    }

    public void setSearchWeightFrcEs(final Integer searchWeightES) {
        this.searchWeightFrcEs = searchWeightES;
    }

    public Integer getSearchWeightFru() {
        return this.searchWeightFru;
    }

    public void setSearchWeightFru(final Integer searchWeightFru) {
        this.searchWeightFru = searchWeightFru;
    }

    public List<Product> getProducts()
    {
        return this.products;
    }

    public Boolean getHasSpecials()
    {
        return this.hasSpecials;
    }

    public Boolean getHasVerizonFios()
    {
        return this.hasVerizonFios;
    }

    public Boolean getHasBrokerFees()
    {
        return this.hasBrokerFees;
    }

    public List<Locale> getTranslations()
    {
        return this.translations;
    }

    public Boolean getHasVideo()
    {
        return this.hasVideo;
    }

    public Boolean getHasAerialVideo()
    {
        return this.hasAerialVideo;
    }

    public Integer getSearchWeightFrcMobile() {
        return this.searchWeightFrcMobile;
    }

    public void setSearchWeightFrcMobile(final Integer searchWeightFrcMobile) {
        this.searchWeightFrcMobile = searchWeightFrcMobile;
    }

    public Integer getRelativePerformanceScore() {
        return this.relativePerformanceScore;
    }

    public void setRelativePerformanceScore(final Integer relativePerformanceScore) {
        this.relativePerformanceScore = relativePerformanceScore;
    }

    public void setProducts(final List<Product> products)
    {
        this.products = products;
    }

    public void setHasSpecials(final Boolean hasSpecials)
    {
        this.hasSpecials = hasSpecials;
    }

    public void setHasVerizonFios(final Boolean hasVerizonFios)
    {
        this.hasVerizonFios = hasVerizonFios;
    }

    public void setHasBrokerFees(final Boolean hasBrokerFees)
    {
        this.hasBrokerFees = hasBrokerFees;
    }

    public void setTranslations(final List<Locale> translations)
    {
        this.translations = translations;
    }

    public void setHasVideo(final Boolean hasVideo)
    {
        this.hasVideo = hasVideo;
    }

    public void setHasAerialVideo(final Boolean hasAerialVideo)
    {
        this.hasAerialVideo = hasAerialVideo;
    }

    public String getFacebookId() {
        return this.facebookId;
    }

    public void setFacebookId(final String facebookId) {
        this.facebookId = facebookId;
    }

    public PropertyManagementCompany getPmc() {
        return this.pmc;
    }

    public void setPmc(final PropertyManagementCompany pmc) {
        this.pmc = pmc;
    }

    public GuestCard getGuestCard() {
        return this.guestCard;
    }

    public void setGuestCard(final GuestCard guestCard) {
        this.guestCard = guestCard;
    }

    public String getVanityUrl() {
        return this.vanityUrl;
    }

    public void setVanityUrl(final String vanityUrl) {
        this.vanityUrl = vanityUrl;
    }
}
