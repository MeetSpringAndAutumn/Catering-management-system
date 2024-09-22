package com.lzy.shan.restaurant.dao;

import com.lzy.shan.restaurant.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleDao {
    int insert(UserRole userRole);
    int update(UserRole userRole);
}
