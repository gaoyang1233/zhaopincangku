package com.zhaopin.mapper;

import com.zhaopin.pojo.DetailAddr;

public interface DetailAddrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailAddr record);

    int insertSelective(DetailAddr record);

    DetailAddr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailAddr record);

    int updateByPrimaryKeyWithBLOBs(DetailAddr record);

    int updateByPrimaryKey(DetailAddr record);
}