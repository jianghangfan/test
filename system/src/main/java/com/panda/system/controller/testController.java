package com.panda.system.controller;

import com.panda.system.dao.Test;
import com.panda.system.service.TestMapperImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class testController {

    @Resource
    private TestMapperImpl testMapperimpl;
    @RequestMapping("/test")
    public List<Test> getName(){
        return testMapperimpl.testList();
    }
}
