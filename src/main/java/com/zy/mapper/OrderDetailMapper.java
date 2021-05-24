package com.zy.mapper;

import com.zy.entity.OrderDetail;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * OrderDetailMapper继承基类
 */
@Repository
public interface OrderDetailMapper extends Mapper<OrderDetail> {
}