package com.zy.mapper;

import com.zy.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * ProductMapper继承基类
 */
@Repository
public interface ProductMapper extends Mapper<Product> {

    List<Product> findByLevel(@Param(value = "level") Integer level, @Param(value = "id") Integer id);

    List<Product> findByName(String keyWord);

}