package com.zhaopin.mapper;

import com.zhaopin.pojo.Adminrole;

public interface AdminroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adminrole record);

    int insertSelective(Adminrole record);

    Adminrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adminrole record);

    int updateByPrimaryKey(Adminrole record);
}