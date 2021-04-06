package com.ck.controller;

import com.ck.entity.emp;
import com.ck.service.Iempservice;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class empController {
    @Autowired
    private Iempservice iempservice;


    Logger logger = Logger.getLogger(empController.class);

    @GetMapping("query")
    public String query(ModelMap map){
    List<emp> empList=null;
        try {
            logger.debug("query emp doing...");
            empList= iempservice.query();
            logger.debug("query emp down");
            map.put("empList",empList);
        }catch (Exception e){
            logger.error("query emp error",e);
        }
           return "index";
    }
}
