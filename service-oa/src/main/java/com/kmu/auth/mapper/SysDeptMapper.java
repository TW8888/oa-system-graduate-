package com.kmu.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kmu.model.system.SysDept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {     //泛型允许你在定义类、接口或方法时使用一个或多个类型参数
}
