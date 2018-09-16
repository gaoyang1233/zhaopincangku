package com.zhaopin.mapper;

import com.zhaopin.pojo.Regist;

public interface RegistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Regist record);

    int insertSelective(Regist record);

    Regist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Regist record);

    int updateByPrimaryKey(Regist record);
}