package com.forrent.beans.propertyListing;

public class Product
{
    public static final String TYPE_COMMUNITY_THEATER = "CommThtr";
    public static final String TYPE_AERIAL_VIDEO = "AerialVideo";
    public static final String TYPE_SPANISH_LANGUAGE = "LangES";

    private String code;

    public Product() {}

    public Product(final String code)
    {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product [code=" + this.code + "]";
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode(final String code)
    {
        this.code = code;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());

        return result;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        final Product product = (Product) o;

        return this.code != null ? this.code.equals(product.code) : product.code == null;
    }
}
