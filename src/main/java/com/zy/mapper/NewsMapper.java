package com.zy.mapper;

import com.zy.entity.News;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface NewsMapper extends Mapper<News> {

}