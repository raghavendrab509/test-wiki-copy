package com.forrent.beans.propertyListing;

import java.util.List;

public class GuestCard {

    private GuestCardRequiredFieldData fieldsData;
    private List<String> products;

    public GuestCardRequiredFieldData getFieldsData() {
        return this.fieldsData;
    }

    public void setFieldsData(final GuestCardRequiredFieldData fieldsData) {
        this.fieldsData = fieldsData;
    }

    public List<String> getProducts() {
        return this.products;
    }

    public void setProducts(final List<String> products) {
       this.products = products;
    }


}
