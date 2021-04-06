package com.ck.dao;

import com.ck.entity.emp;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IEmpdao {


    @Select("select * from emp")
    @ResultMap("empdao")
    public List<emp> query();
}
