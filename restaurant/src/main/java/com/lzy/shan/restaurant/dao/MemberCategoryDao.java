package com.lzy.shan.restaurant.dao;


import com.lzy.shan.restaurant.entity.MemberCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/1
 * Time:23:36
 */
@Mapper
public interface MemberCategoryDao extends tk.mybatis.mapper.common.Mapper<MemberCategory>{
    List<MemberCategory> findAll();
    MemberCategory findById(Long id);
    int insert(MemberCategory memberCategory);
    int update(MemberCategory memberCategory);
    int deleteByIds(List<Long> idList);
    MemberCategory findByMcName(MemberCategory memberCategory);
}
