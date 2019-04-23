package com.ssm.service.impl;

import com.ssm.mapper.SysUserMapper;
import com.ssm.pojo.SysUser;
import com.ssm.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper userMapper;


    @Override
    public SysUser queryUserByLoginId(String loginId) {
        SysUser sysuser=new SysUser();
        sysuser=userMapper.queryUserByLoginId(loginId);
        return sysuser;
    }
}
