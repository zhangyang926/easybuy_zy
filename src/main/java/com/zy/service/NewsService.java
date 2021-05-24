package com.zy.service;

import com.zy.entity.News;

import java.util.List;

public interface NewsService {

    List<News> findAll();

    News findById(Integer id);

}
