package com.lzy.shan.restaurant.dao;

import com.lzy.shan.restaurant.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/1
 * Time:23:36
 */
@Mapper
public interface GoodsDao extends tk.mybatis.mapper.common.Mapper<Goods>{
    List<Goods> findPage(Goods goods);
    Goods findById(Integer goodsId);
    Goods findByGoodsName(Goods goods);
    List<Goods> findByGoodsIds(List<Integer> goodsIdList);
    int insert(Goods goods);
    int update(Goods goods);
    int deleteByIds(List<Integer> idList);
}
