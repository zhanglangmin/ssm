package com.ssm.mapper;

import com.ssm.pojo.SysUser;

public interface SysUserMapper {
    int insert(SysUser record);

    int insertSelective(SysUser record);
}