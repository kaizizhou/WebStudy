package com.kaizizhou.service.impl;

import com.kaizizhou.mapper.DeptMapper;
import com.kaizizhou.pojo.Dept;
import com.kaizizhou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteDept(int id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void insertDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insertDept(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void updateDept(Dept dept) {
        deptMapper.updateDept(dept);
    }
}
