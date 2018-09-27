package com.work.controller.job;


import com.work.common.vo.R;
import com.work.domain.job.Type1;
import com.work.service.job.Type1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Type1Controller {

    @Autowired
    private Type1Service type1Service;

    @RequestMapping("typ1save.do")
    public R savetype1(Type1 type1){
        if (type1Service.insert(type1)){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("type1del.do")
    public R deltype1(int id){
        if (type1Service.delete(id)){
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("type1query.do")
    public R type1query(){
        List<Type1> type1s = type1Service.selectAll();
        if (type1s != null){
           return new R(0,"ok",type1s);
        }
        return R.error();
    }

    @RequestMapping("type1ByName.do")
    public R type1ByName(String name){
        Type1 type1 = type1Service.selectByName(name);
        if (type1 != null){
            return new R(0,"ok",type1);
        }
        return R.error();
    }
}
