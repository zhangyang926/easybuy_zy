package com.zy.service.impl;

import com.zy.entity.Product;
import com.zy.mapper.ProductMapper;
import com.zy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findByLevel(Integer level, Integer id) {
        return productMapper.findByLevel(level,id);
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> findByName(String keyWord) {
        return productMapper.findByName(keyWord);
    }

}
