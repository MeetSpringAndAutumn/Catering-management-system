package com.lzy.shan.restaurant.service.Impl;

import com.lzy.shan.restaurant.Enums.ResultEnum;
import com.lzy.shan.restaurant.dao.MemberCategoryDao;
import com.lzy.shan.restaurant.entity.MemberCategory;
import com.lzy.shan.restaurant.exception.CustomException;
import com.lzy.shan.restaurant.service.MemberCategoryService;
import com.lzy.shan.restaurant.utils.SplitIdsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class MemberCategoryServiceImpl implements MemberCategoryService {
    @Autowired
    private MemberCategoryDao memberCategoryDao;
    /**
     * 查询所有会员类型
     * @return
     */
    @Override
    public List<MemberCategory> findAll() {
        return memberCategoryDao.findAll();
    }
    /**
     * 根据会员id查找会员类型信息
     * @param id
     * @return
     */
    @Override
    public MemberCategory findById(Long id) {
        return memberCategoryDao.findById(id);
    }
    /**
     *添加会员类型
     * @param memberCategory
     */
    @Override
    public void insert(MemberCategory memberCategory) {
        MemberCategory result = memberCategoryDao.findByMcName(memberCategory);
        if(result!=null){
            throw new CustomException(ResultEnum.MC_NAME_IS_EXIST);
        }
        memberCategory.setCreateTime(new Date());
        memberCategoryDao.insert(memberCategory);
    }

    /**
     * 修改会员类型信息
     * @param memberCategory
     */
    @Override
    public void update(MemberCategory memberCategory) {
        MemberCategory result = memberCategoryDao.findByMcName(memberCategory);
        if(result!=null){
            throw new CustomException(ResultEnum.MC_NAME_IS_EXIST);
        }
        memberCategory.setModifyTime(new Date());
        memberCategoryDao.update(memberCategory);
    }

    /**
     * 根据会员类型id删除类型
     * @param strIds
     */
    @Override
    public void deleteByIds(String strIds) {
        List<Long> idList = SplitIdsUtil.splitStrIds(strIds);
        memberCategoryDao.deleteByIds(idList);
    }
}
