package org.example.product_catalog.controllers;


import org.example.product_catalog.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductCatalogController {

    @GetMapping("/products")
    public List<Product> getProducts(){
        Product product = new Product();
        product.setId(1L);
        product.setName("IPhone");
        product.setPrice(2000.33);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        return productList;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        Product product = new Product();
        product.setId(id);
        product.setName("IPad");
        return product;
    }
}
