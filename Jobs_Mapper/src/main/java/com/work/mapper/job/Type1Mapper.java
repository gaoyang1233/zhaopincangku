package com.work.mapper.job;

import com.work.domain.job.Type1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
public interface Type1Mapper {

    @Insert("insert into t_type1(name,flag) values(#{name},1)")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(Type1 type1);

    @Update("update t_type1 set flag=2 where id=#{id}")
    int delete(int id);

    @Select("select name from t_type1")
    List<Type1> selectAll();

    @Select("select name from t_type1 where name=#{name}")
    Type1 selectByName(String name);
}
