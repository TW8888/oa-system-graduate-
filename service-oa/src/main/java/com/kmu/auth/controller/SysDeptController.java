package com.kmu.auth.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kmu.auth.service.SysDeptService;
import com.kmu.common.result.Result;
import com.kmu.model.system.SysDept;
import com.kmu.vo.system.SysDeptQueryVo;
import com.kmu.vo.system.SysUserQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "部门管理接口")
@RestController
@RequestMapping("/admin/system/sysDept")
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    @ApiOperation(value = "获取所有部门")
    //查询所有部门
    @PostMapping("/findAll")
    public Result findAll(){
        List<SysDept> list = sysDeptService.list();
        return Result.ok(list);

    }

    //部门分页查询
    @ApiOperation(value= "部门分页查询")
    @PostMapping("{page}/{limit}")
    public Result index(@PathVariable Long page,
                        @PathVariable Long limit,
                        SysDeptQueryVo sysDeptQueryVo){
        Page<SysDept> pageParam = new Page<>(page,limit);
        LambdaQueryWrapper<SysDept> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
        String deptName = sysDeptQueryVo.getDeptName();
        if(!StringUtils.isEmpty(deptName)){
            objectLambdaQueryWrapper
        }

        return Result.ok();

    }
}
