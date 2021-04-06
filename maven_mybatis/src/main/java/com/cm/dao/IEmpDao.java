package com.cm.dao;

import com.cm.entity.emp;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IEmpDao {

    @Select("select * from emp")
    @ResultMap("empmapper")
    public List<emp> queryall();
}
