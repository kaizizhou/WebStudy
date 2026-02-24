package com.kaizizhou.controller;

import com.kaizizhou.pojo.Dept;
import com.kaizizhou.pojo.Result;
import com.kaizizhou.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    private static final Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;
    @GetMapping
    public Result getDepts() {
        List<Dept> depts = deptService.findAll();
        log.info("查询所有部门");
        //depts.forEach(System.out::println);
        return Result.success(depts);
    }
    //方式一 通过HttpServletRequest获取参数
//    @DeleteMapping("/depts")
//    public Result deleteDept(HttpServletRequest  request) {
//        deptService.deleteDept(Integer.parseInt(request.getParameter("id")));
//        return Result.success();
//    }

    //方式二 通过@RequestParam获取参数
//    @DeleteMapping("/depts")
//    public Result deleteDept(@RequestParam(value = "id", required = false) Integer  deptId) {
//        System.out.println("deptId:"+deptId);
//        deptService.deleteDept(deptId);
//        return Result.success();
//    }

    //方式二 通过@RequestParam获取参数
    @DeleteMapping
    public Result deleteDept( Integer  id) {
        System.out.println("id:"+id);
        deptService.deleteDept(id);
        log.info("根据ID删除部门：{}",id);
        return Result.success();
    }
    @PostMapping
    public Result insertDept(@RequestBody Dept dept) {
        deptService.insertDept(dept);
        log.info("添加部门：{}",dept);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Dept dept = deptService.getById(id);
        log.info("根据ID查询部门：{}",id);
        return Result.success(dept);
    }
    @PutMapping
    public Result updateDept(@RequestBody Dept dept){
        deptService.updateDept(dept);
        log.info("更新部门：{}",dept);
        return Result.success();
    }
}
