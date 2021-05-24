package com.zy.service;

import com.zy.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findByLevel(Integer level, Integer id);

    Product findById(Integer id);

    List<Product> findByName(String keyWord);

}
