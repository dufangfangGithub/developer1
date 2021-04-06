package com.cm;

import static org.junit.Assert.assertTrue;

import com.cm.dao.IEmpDao;
import com.cm.entity.emp;
import com.cm.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.openSession(false);
        IEmpDao empDao = sqlSession.getMapper(IEmpDao.class);
        List<emp> queryall = empDao.queryall();
        System.out.println(queryall);
    }
}
