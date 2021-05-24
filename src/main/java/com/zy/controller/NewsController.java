package com.zy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.entity.News;
import com.zy.service.NewsService;
import com.zy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/")
    public RespBean findAll(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,10);
        List<News> newsList = newsService.findAll();
        PageInfo<News> pageInfo = new PageInfo(newsList);
        return RespBean.success("查询成功",pageInfo);
    }

    @GetMapping(value = "/{newsId}")
    public RespBean findById(@PathVariable Integer newsId){
        News news = newsService.findById(newsId);
        return RespBean.success("查询成功",news);
    }

}
