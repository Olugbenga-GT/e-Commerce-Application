package com.Pentazon.Shopping;

import com.Pentazon.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }


    public List<Product> getProducts() {
        return products;
    }

    public  void addToCart(Product product){

    }
}
