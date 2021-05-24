package com.zy.controller;

import com.zy.entity.ProductCategory;
import com.zy.service.ProductCategoryService;
import com.zy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "productCategory")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(value = "/")
    public RespBean findByParentid(){
        List<ProductCategory> list = productCategoryService.findByParentid();
        return RespBean.success("查询成功",list);
    }

}
