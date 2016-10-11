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
    private List<Product> products = new ArrayList<Product>();
    private Boolean hasSpecials;
    private Boolean hasVerizonFios;
    private Boolean hasBrokerFees;
    private List<String> translations = new ArrayList<>();
    private Boolean hasVideo;
    private Boolean hasAerialVideo;

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
        return products;
    }

    public Boolean getHasSpecials()
    {
        return hasSpecials;
    }

    public Boolean getHasVerizonFios()
    {
        return hasVerizonFios;
    }

    public Boolean getHasBrokerFees()
    {
        return hasBrokerFees;
    }

    public List<String> getTranslations()
    {
        return translations;
    }

    public Boolean getHasVideo()
    {
        return hasVideo;
    }

    public Boolean getHasAerialVideo()
    {
        return hasAerialVideo;
    }

    public Boolean hasProduct(Product product)
    {
        return this.products.contains(product);
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

    public void setProducts(List<Product> products)
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

    public void setTranslations(final List<String> translations)
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
}
