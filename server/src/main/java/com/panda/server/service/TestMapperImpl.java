package com.panda.server.service;

import com.panda.server.dao.Test;
import com.panda.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestMapperImpl{

    @Resource
    private TestMapper testMapper;

    public List<Test> testList(){
        return testMapper.selectByExample(null);
    }
}
