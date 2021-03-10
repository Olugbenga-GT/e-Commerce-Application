package com.Pentazon.Product;

import com.Pentazon.Exception.ProductException;

public class ProductServiceImpl implements ProductService {

    private ProductRepoMock productRepo = new ProductRepoMock();
    @Override
    public Product findProductById(String productId) throws ProductException {
        return productRepo.getProductById(productId);
    }



}
