package com.lzy.shan.restaurant.dao;

import com.lzy.shan.restaurant.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/5
 * Time:20:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserDaoTest {
    @Autowired
    private SysUserDao sysUserDao;
    @Test
    public void findAll() {
        //System.out.println(sysUserDao.findAll());
    }

    @Test
    public void findByLoginCode() {
        SysUser sysUser = new SysUser();
        sysUser.setLoginCode("18384623911");
        //System.out.println(sysUserDao.findByLoginCode(sysUser));
    }
}