package com.zy.mapper;

import com.zy.entity.UserAddress;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserAddressMapper继承基类
 */
@Repository
public interface UserAddressMapper extends Mapper<UserAddress> {
}