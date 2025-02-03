package com.kmu.vo.system;

import java.io.Serializable;

public class SysDeptQueryVo implements Serializable {
    private String DeptName;

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }
}
