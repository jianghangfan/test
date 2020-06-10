package com.panda.system.service;

import com.panda.system.dao.Test;
import com.panda.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestMapperImpl{

    @Resource
    private TestMapper testMapper;

    public List<Test> testList(){
        return testMapper.testList();
    }
}
