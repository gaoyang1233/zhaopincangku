package com.work.mapper.job;

import com.work.domain.job.Job;
import com.work.domain.job.JobVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface JobMapper {

    @Insert("insert into t_job(name,salary,aid,rid,createtime,sort,t2id)values(#{name},#{salary},#{aid},#{rid},now(),#{sort},#{t2id})")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    int insert(Job job);

    @Delete("delete from t_job where id=#{id}")
    int delete(int id);

    @Update("uptate t_job set salary=#{salary} where id=#{id}")
    int update(@Param("salary") int salary,@Param("id") int id);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id where j.t2id=#{id}")
    @ResultType(JobVo.class)
    List<JobVo> selectByType2(int id);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id where j.name=#{name} order by j.sort")
    @ResultType(JobVo.class)
    JobVo selectByName(String name);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id where j.salary between #{min} and #{max} order by j.salary")
    @ResultType(JobVo.class)
    List<JobVo> selectBysalary(@Param("min") int min,@Param("max") int max);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id left join t_require r on j.rid=r.id where r.edu #{edu} order by j.salary")
    @ResultType(JobVo.class)
    List<JobVo> selectByedu(int edu);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id left join t_require r on j.rid=r.id where r.minexp> #{minexp} and " +
            "r,maxexp < #{maxexp} order by j.salary")
    @ResultType(JobVo.class)
    List<JobVo> selectByExp(@Param("minexp") int minexp,@Param("maxexp") int mapexp);


    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id where c.name=#{name} order by j.salary")
    @ResultType(JobVo.class)
    List<JobVo> selectByCity(String name);

    @Select("select j.name,j.salary,j.createtime,c.name com.name from t_job j left join t_address a on j.aid=a.id" +
            "left join t_city c on a.cid=c.id left join t_comjob cj on j.id=cj.jid left join t_company com" +
            "on cj.cid=com.id where com.name=#{name} order by j.salary")
    @ResultType(JobVo.class)
    List<JobVo> selectByComname(String name);

}
