package com.work.mapper.admin;

import com.work.domain.admin.Adminrole;

public interface AdminroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adminrole record);

    int insertSelective(Adminrole record);

    Adminrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adminrole record);

    int updateByPrimaryKey(Adminrole record);
}