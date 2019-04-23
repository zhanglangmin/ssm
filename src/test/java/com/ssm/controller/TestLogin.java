package com.ssm.controller;


import com.ssm.pojo.SysUser;
import com.ssm.service.ISysUserService;
import org.apache.ibatis.io.VFS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring.xml"})
public class TestLogin {

    @Autowired
    private ISysUserService sysUserService;

    @Test
    public void test1(){
        SysUser user=new SysUser();
        user=sysUserService.queryUserByLoginId("admin");
        System.out.println(user.getUserName());
    }

}
