package com.ck.controller;

import com.ck.entity.emp;
import com.ck.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class empController {
    @Autowired
    private IEmpService iEmpService;

    @GetMapping("queryAll")
    public String queryAll(ModelMap map){
        List<emp> list = iEmpService.queryAll();
        map.put("list",list);
        return "index";
    }
}
