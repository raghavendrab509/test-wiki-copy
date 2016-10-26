package com.forrent.beans.propertyListing;

public class Product
{
    String code;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Product product = (Product) o;

        return code != null ? code.equals(product.code) : product.code == null;

    }
}
