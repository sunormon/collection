package com.frame.collection.service.impl;

import com.frame.collection.entity.SysConfig;
import com.frame.collection.mapper.TestMapper;
import com.frame.collection.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private TestMapper dao;



    @Override
    public List<SysConfig> queryAll() {

        return dao.queryAll();
    }
}
