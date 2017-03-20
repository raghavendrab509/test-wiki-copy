package com.forrent.beans.propertyListing;

import java.util.ArrayList;
import java.util.List;

public class Detail
{
    private Account account = new Account();
    private List<Context> contexts = new ArrayList<>();
    private String facebookId;
    private GuestCardSettings guestCard;
    private Boolean hasAerialVideo;
    private Boolean hasBrokerFees;
    private Boolean hasSpecials;
    private Boolean hasVerizonFios;
    private Boolean hasVideo;
    private Boolean isActive;
    private Boolean paid;
    private PropertyManagementCompany pmc;
    private List<String> products = new ArrayList<>();
    private Integer relativePerformanceScore;
    private Integer searchWeightFrc;
    private Integer searchWeightFrcEs;
    private Integer searchWeightFrcMobile;
    private Integer searchWeightFru;
    private List<Locale> translations = new ArrayList<>();
    private String vanityUrl;

    public Account getAccount() {
        return this.account;
    }

    public List<Context> getContexts()
    {
        return this.contexts;
    }

    public String getFacebookId() {
        return this.facebookId;
    }

    public GuestCardSettings getGuestCard() {
        return this.guestCard;
    }

    public Boolean getHasAerialVideo()
    {
        return this.hasAerialVideo;
    }

    public Boolean getHasBrokerFees()
    {
        return this.hasBrokerFees;
    }

    public Boolean getHasSpecials()
    {
        return this.hasSpecials;
    }

    public Boolean getHasVerizonFios()
    {
        return this.hasVerizonFios;
    }

    public Boolean getHasVideo()
    {
        return this.hasVideo;
    }

    public Boolean getIsActive()
    {
        return this.isActive;
    }

    public Boolean getPaid() {
        return this.paid;
    }

    public PropertyManagementCompany getPmc() {
        return this.pmc;
    }

    public List<String> getProducts()
    {
        return this.products;
    }

    public Integer getRelativePerformanceScore() {
        return this.relativePerformanceScore;
    }

    public Integer getSearchWeightFrc() {
        return this.searchWeightFrc;
    }

    public Integer getSearchWeightFrcEs() {
        return this.searchWeightFrcEs;
    }

    public Integer getSearchWeightFrcMobile() {
        return this.searchWeightFrcMobile;
    }

    public Integer getSearchWeightFru() {
        return this.searchWeightFru;
    }


    public List<Locale> getTranslations()
    {
        return this.translations;
    }

    public String getVanityUrl() {
        return this.vanityUrl;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }

    public void setContexts(final List<Context> contexts)
    {
        this.contexts = contexts;
    }

    public void setFacebookId(final String facebookId) {
        this.facebookId = facebookId;
    }

    public void setGuestCard(final GuestCardSettings guestCard) {
        this.guestCard = guestCard;
    }

    public void setHasAerialVideo(final Boolean hasAerialVideo)
    {
        this.hasAerialVideo = hasAerialVideo;
    }

    public void setHasBrokerFees(final Boolean hasBrokerFees)
    {
        this.hasBrokerFees = hasBrokerFees;
    }

    public void setHasSpecials(final Boolean hasSpecials)
    {
        this.hasSpecials = hasSpecials;
    }

    public void setHasVerizonFios(final Boolean hasVerizonFios)
    {
        this.hasVerizonFios = hasVerizonFios;
    }

    public void setHasVideo(final Boolean hasVideo)
    {
        this.hasVideo = hasVideo;
    }

    public void setIsActive(final Boolean isActive)
    {
        this.isActive = isActive;
    }

    public void setPaid(final Boolean paid) {
        this.paid = paid;
    }

    public void setPmc(final PropertyManagementCompany pmc) {
        this.pmc = pmc;
    }

    public void setProducts(final List<String> products)
    {
        this.products = products;
    }

    public void setRelativePerformanceScore(final Integer relativePerformanceScore) {
        this.relativePerformanceScore = relativePerformanceScore;
    }

    public void setSearchWeightFrc(final Integer searchWeightFrc) {
        this.searchWeightFrc = searchWeightFrc;
    }

    public void setSearchWeightFrcEs(final Integer searchWeightES) {
        this.searchWeightFrcEs = searchWeightES;
    }

    public void setSearchWeightFrcMobile(final Integer searchWeightFrcMobile) {
        this.searchWeightFrcMobile = searchWeightFrcMobile;
    }

    public void setSearchWeightFru(final Integer searchWeightFru) {
        this.searchWeightFru = searchWeightFru;
    }

    public void setTranslations(final List<Locale> translations)
    {
        this.translations = translations;
    }

    public void setVanityUrl(final String vanityUrl) {
        this.vanityUrl = vanityUrl;
    }
}
