package com.kaizizhou.mapper;

import com.kaizizhou.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface DeptMapper {
    // @Select("select * from dept order by update_time desc")
    List<Dept> findAll();

    void deleteById(int id);

    void insertDept(Dept dept);

    Dept getById(Integer id);

    void updateDept(Dept dept);
}
