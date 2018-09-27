package com.work.serviceimpl.job;

import com.work.domain.job.Type1;
import com.work.mapper.job.Type1Mapper;
import com.work.service.job.Type1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Type1ServiceImpl implements Type1Service {

    @Autowired
    private Type1Mapper type1Mapper;

    @Override
    public boolean insert(Type1 type1) {
        if (type1 != null){
         return type1Mapper.insert(type1)>0;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (id > 0) {
            return type1Mapper.delete(id) > 0;
            }
        return false;
    }

    @Override
    public List<Type1> selectAll() {

        return type1Mapper.selectAll();
    }

    @Override
    public Type1 selectByName(String name) {
        if (name != null && name.length() > 0){
            return type1Mapper.selectByName(name);
        }
        return null;
    }
}
