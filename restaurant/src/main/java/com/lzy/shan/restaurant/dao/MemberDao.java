package com.lzy.shan.restaurant.dao;


import com.lzy.shan.restaurant.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/1
 * Time:23:36
 */
@Mapper
public interface MemberDao{
    List<Member> findPage(Member condition);
    Member searchByPhone(Member member);
    Member searchByMemberCode(Member member);
    int insert(Member member);
    int deleteByIds(List<Long> idList);
    int update(Member member);
}
