package com.lzy.shan.restaurant.dao;

import com.lzy.shan.restaurant.entity.SysRole;
import com.lzy.shan.restaurant.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/1
 * Time:23:32
 */
@Mapper
public interface SysRoleDao extends tk.mybatis.mapper.common.Mapper<SysRole>{
    Set<String> findRoleNamesByUser(SysUser sysUser);
    List<SysRole> findAll();
}

