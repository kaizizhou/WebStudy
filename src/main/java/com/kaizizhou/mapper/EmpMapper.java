package com.kaizizhou.mapper;

import com.kaizizhou.pojo.Emp;
import com.kaizizhou.pojo.RequestParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
//    @Select("select * from emp")
    List<Emp> findAll(RequestParam requestParam);
}
