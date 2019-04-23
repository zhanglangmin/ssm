package com.ssm.service;

import com.ssm.pojo.SysUser;

public interface ISysUserService {


    SysUser queryUserByLoginId(String loginId);
}
