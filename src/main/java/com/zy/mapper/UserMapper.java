package com.zy.mapper;

import com.zy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends Mapper<User> {

    User loginUser(@Param("name") String name,@Param("pwd") String pwd);

}