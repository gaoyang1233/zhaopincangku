package com.work.mapper.job;

import com.work.domain.job.Type2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface Type2Mapper {

    @Insert("insert into t_type2 (name,flag,pid) values(#{name},1,#{pid})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(Type2 type2);

    @Update("update t_type2 set flag=2 where id=#{id}")
    int delete(int id);

    @Select("select t2.name from t_type2 t2 left join t_type1 t1 on t2.pid=t1.id where t1.id=#{id}}")
    List<Type2> selectByType1(int id);

    @Select("select name form t_type2 where name=#{name}")
    Type2 selectByName(String name);
}
