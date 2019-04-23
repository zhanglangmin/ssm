package com.ssm.controller;

import com.ssm.pojo.SysUser;
import com.ssm.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private ISysUserService sysUserService;

    @Transactional
    @ResponseBody
    @PostMapping("/login")
    public String loginByLoginId(String loginId){
        SysUser sysuser=new SysUser();
        sysuser=sysUserService.queryUserByLoginId(loginId);
        return sysuser.toString();
    }


}
