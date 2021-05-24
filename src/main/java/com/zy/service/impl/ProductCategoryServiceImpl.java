package com.zy.service.impl;

import com.zy.entity.Product;
import com.zy.entity.ProductCategory;
import com.zy.mapper.ProductCategoryMapper;
import com.zy.mapper.ProductMapper;
import com.zy.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> findByParentid() {
        List<ProductCategory> list = new ArrayList<>();
        List<ProductCategory> yiji = productCategoryMapper.findByType(1);
        for (ProductCategory p : yiji) {
            List<ProductCategory> erji = productCategoryMapper.findByParentid(p.getId());
            p.setChildren(erji);
            List<Product> products = productMapper.findByLevel(1,p.getId());
            p.setProducts(products);
            for (int i = 0; i < p.getChildren().size(); i++) {
                List<ProductCategory> sanji = productCategoryMapper.findByParentid(p.getChildren().get(i).getId());
                p.getChildren().get(i).setChildren(sanji);
            }
            list.add(p);
        }
        return list;
    }

}
