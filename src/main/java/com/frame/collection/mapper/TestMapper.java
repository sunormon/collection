package com.frame.collection.mapper;


import com.frame.collection.entity.SysConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    public List<SysConfig> queryAll();
}
