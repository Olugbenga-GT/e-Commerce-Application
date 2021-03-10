package com.Pentazon.Product;

import java.math.BigDecimal;

public class Product {
    private String productId;
    private String productName;
    private String productDescription;
    private BigDecimal price;

    public  Product(){}

    public Product(String productName, String productDescription, BigDecimal price) {

        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
