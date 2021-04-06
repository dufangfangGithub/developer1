package com.ck.service.impl;

import com.ck.dao.IEmpdao;
import com.ck.entity.emp;
import com.ck.service.Iempservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IempserviceImpl implements Iempservice {
    @Autowired
    private IEmpdao iEmpdao;

    @Override
    public List<emp> query() {
        return iEmpdao.query();
    }
}
