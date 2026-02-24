package com.kaizizhou.service;

import com.kaizizhou.pojo.Emp;
import com.kaizizhou.pojo.PageResult;
import com.kaizizhou.pojo.RequestParam;

import java.util.List;

public interface EmpService {
    PageResult< Emp> getEmps(RequestParam requestParam);
}
