package com.zy.mapper;

import com.zy.entity.ProductCategory;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * ProductCategoryMapper继承基类
 */
@Repository
public interface ProductCategoryMapper extends Mapper<ProductCategory> {

    List<ProductCategory> findByType(Integer type);

    List<ProductCategory> findByParentid(Integer parentid);

}