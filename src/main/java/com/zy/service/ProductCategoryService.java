package com.zy.service;

import com.zy.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    List<ProductCategory> findByParentid();

}
