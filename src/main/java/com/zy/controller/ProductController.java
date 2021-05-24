package com.zy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.entity.News;
import com.zy.entity.Product;
import com.zy.service.ProductService;
import com.zy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public RespBean findByLevel(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "level") Integer level,
                                @RequestParam(value = "id") Integer id){
        PageHelper.startPage(pageNum,12);
        List<Product> list = productService.findByLevel(level,id);
        PageInfo<News> pageInfo = new PageInfo(list);
        return RespBean.success("查询成功",pageInfo);
    }

    @GetMapping(value = "/{id}")
    public RespBean findById(@PathVariable Integer id){
        Product p = productService.findById(id);
        return RespBean.success("查询成功",p);
    }

    @GetMapping(value = "/findByName")
    public RespBean findByName(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "keyWord") String keyWord){
        PageHelper.startPage(pageNum,12);
        List<Product> list = productService.findByName(keyWord);
        PageInfo<News> pageInfo = new PageInfo(list);
        return RespBean.success("查询成功",pageInfo);
    }

}
