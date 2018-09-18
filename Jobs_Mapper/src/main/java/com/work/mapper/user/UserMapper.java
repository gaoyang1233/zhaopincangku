package com.work.mapper.user;

import com.work.domain.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    //注册
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //修改密码
    int updatePassword(@Param("password") String password, @Param("id") int id);


}