package com.zy.mapper;

import com.zy.entity.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * OrderMapper继承基类
 */
@Repository
public interface OrderMapper extends Mapper<Order> {
}