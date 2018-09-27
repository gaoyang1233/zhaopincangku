package com.work.domain.job;

import com.work.domain.address.Address;

import java.util.Date;


//工作表
public class Job {
    private Integer id;

    private String name;

    private Integer salary;

    private Address address;

    private Require require;

    private int sort;

    private int t2id;

    public int getT2id() {
        return t2id;
    }

    public void setT2id(int t2id) {
        this.t2id = t2id;
    }

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Require getRequire() {
        return require;
    }

    public void setRequire(Require require) {
        this.require = require;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}