package com.lzy.shan.restaurant.service;

import com.lzy.shan.restaurant.entity.CustomPageInfo;
import com.lzy.shan.restaurant.entity.Member;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/2
 * Time:14:58
 *
 * 会员管理业务逻辑
 */

public interface MemberService {
    /**
     * 修改删除
     * @param member
     * @return
     */
    void update(Member member);

    /**
     * 添加会员
     * @param member
     * @return
     */
    void addMember(Member member);

    /**
     * 分页查询，已经多条件分页查询
     * @param pageInfo
     * @return
     */
    CustomPageInfo<Member> findPage(CustomPageInfo<Member> pageInfo);

    /**
     * 根据memberId查找会员
     * @param member
     * @return
     */
    Member findMemberById(Member member);

    /**
     * 根据会员号查询会员
     * @param member
     * @return
     */
    Member findMemberByMemberCode(Member member);

    /**
     *根据id删除用户
     */
    void deleteByIds(String ids);

}
