package com.ushan.dream_shops.service.product;

import com.ushan.dream_shops.model.Product;
import com.ushan.dream_shops.request.AddProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long productId);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long  productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);;

}