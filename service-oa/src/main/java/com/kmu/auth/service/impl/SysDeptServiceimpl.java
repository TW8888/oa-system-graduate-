package com.kmu.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kmu.auth.mapper.SysDeptMapper;
import com.kmu.auth.service.SysDeptService;
import com.kmu.model.system.SysDept;
import org.springframework.stereotype.Service;

@Service
public class SysDeptServiceimpl extends ServiceImpl<SysDeptMapper,SysDept> implements SysDeptService {

}
