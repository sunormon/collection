package com.frame.collection.controller;

import com.frame.collection.entity.SysConfig;
import com.frame.collection.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
@Slf4j
@RestController
public class TestController {
    DataSource dataSource;

    private final TestService service;
    public TestController(TestService service,DataSource dataSource){
        this.service = service;
        this.dataSource = dataSource;
    }

    @RequestMapping(value = "/hello")
    public ResponseEntity<Object> show() throws SQLException {
//        System.out.println(dataSource.getConnection().toString());
        log.info("数据库连接",dataSource.getConnection().toString());
        List<SysConfig> list = service.queryAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
