package com.zhaopin.mapper;

import com.zhaopin.pojo.Type2;

public interface Type2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type2 record);

    int insertSelective(Type2 record);

    Type2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type2 record);

    int updateByPrimaryKey(Type2 record);
}