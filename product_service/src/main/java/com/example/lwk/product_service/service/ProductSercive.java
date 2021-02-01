package com.example.lwk.product_service.service;

import com.example.lwk.product_service.domain.Product;

import java.util.List;

public interface ProductSercive {

 List<Product> listProduct();

 Product  findById(int id);
}
