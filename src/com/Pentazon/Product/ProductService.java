package com.Pentazon.Product;

import com.Pentazon.Exception.ProductException;

/**
 * Product services for dealing with products in Pentazon
 */
public interface ProductService {

   public  Product findProductById(String productId) throws ProductException;
}
