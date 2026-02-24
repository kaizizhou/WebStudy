package com.kaizizhou.controller;

import com.kaizizhou.pojo.Emp;
import com.kaizizhou.pojo.PageResult;
import com.kaizizhou.pojo.RequestParam;
import com.kaizizhou.pojo.Result;
import com.kaizizhou.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/emps")
@RestController
public class EmpController {
    private static final Logger log = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;
    @GetMapping
    public Result getEmps(RequestParam requestParam){
        log.info("请求参数：{}",requestParam);
        PageResult< Emp>  pageResult= empService.getEmps(requestParam);
        return Result.success(pageResult);
    }
}
