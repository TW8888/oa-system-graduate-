package com.kmu.auth;

import com.kmu.auth.mapper.SysDeptMapper;
import com.kmu.model.system.SysDept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class TestMpDemoTW {
    @Autowired
    private SysDeptMapper mapper;

    @Test
    public void getAll() {
        List<SysDept> sysDepts = mapper.selectList(null);
        System.out.println(sysDepts);

    }

    @Test
    public void insert() {
        SysDept sysDept = new SysDept();
        sysDept.setName("爸爸");
        int num = mapper.insert(sysDept);
        System.out.println(num);

    }

    @Test
    public void update() {
        SysDept sysDept = mapper.selectById(1);
        sysDept.setName("龟龟");
        int i = mapper.updateById(sysDept);
        System.out.println(i);

    }
    @Test
    public void delete() {
        int i = mapper.deleteById(2016);
        System.out.println(i);
    }




}
