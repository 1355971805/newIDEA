package cn.happy.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王 on 2017/7/7.
 */
public class Dept implements Serializable {
    private Integer deptNo;

    public Integer getDepNo() {
        return deptNo;
    }

    public void setDepNo(Integer depNo) {
        this.deptNo = depNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private String deptName;
    private List<Emp> emps=new ArrayList<Emp>();

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

}
