package com.zy.service.impl;

import com.zy.entity.News;
import com.zy.mapper.NewsMapper;
import com.zy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    @Override
    public News findById(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }

}
