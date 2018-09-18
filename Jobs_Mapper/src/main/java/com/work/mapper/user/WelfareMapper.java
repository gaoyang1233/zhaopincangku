package com.work.mapper.user;

import com.work.domain.user.Welfare;

public interface WelfareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Welfare record);

    int insertSelective(Welfare record);

    Welfare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Welfare record);

    int updateByPrimaryKey(Welfare record);
}