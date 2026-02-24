package com.kaizizhou.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kaizizhou.mapper.EmpMapper;
import com.kaizizhou.pojo.Emp;
import com.kaizizhou.pojo.PageResult;
import com.kaizizhou.pojo.RequestParam;
import com.kaizizhou.service.EmpService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageResult<Emp> getEmps(RequestParam requestParam) {
        // 分页
        PageHelper.startPage(requestParam.getPage(), requestParam.getPageSize());
        // 查询
        List<Emp> emps = empMapper.findAll(requestParam);
        // 封装分页结果
        Page<Emp> empPage = (Page<Emp>) emps;

        return new PageResult< Emp>(empPage.getTotal(), empPage.getResult());
    }
}
