package com.kaizizhou.service;

import com.kaizizhou.pojo.Dept;

import java.time.LocalDateTime;
import java.util.List;

public interface DeptService {
     List<Dept> findAll();

     void deleteDept(int id);

     void insertDept(Dept dept);

     Dept getById(Integer id);

     void updateDept(Dept dept);
}
