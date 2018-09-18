package com.work.mapper.user;

import com.work.domain.user.Regist;

public interface RegistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Regist record);

    int insertSelective(Regist record);

    Regist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Regist record);

    int updateByPrimaryKey(Regist record);
}