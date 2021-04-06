package com.ck.service.impl;

import com.ck.dao.IEmpDao;
import com.ck.entity.emp;
import com.ck.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IEmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao iEmpDao;

    @Override
    public List<emp> queryAll() {
        return iEmpDao.queryAll();
    }
}
