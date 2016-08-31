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
    private PropertyManagementCompany pmc;

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

    public Boolean hasProduct(final Product product)
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

    public void setProducts(final List<Product> products)
    {
        this.products = products;
    }

    public PropertyManagementCompany getPmc() {
        return this.pmc;
    }

    public void setPmc(final PropertyManagementCompany pmc) {
        this.pmc = pmc;
    }
}
