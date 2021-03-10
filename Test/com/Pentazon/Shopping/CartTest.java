package com.Pentazon.Shopping;

import com.Pentazon.Product.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToCart(){
    assertTrue(cart.getProducts().isEmpty());
    Product testProduct = new Product();
    cart.addToCart(testProduct);
    }
}