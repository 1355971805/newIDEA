package cn.happy.dao;

import cn.happy.entity.Dept;


import java.util.List;

/**
 * Created by 王 on 2017/7/7.
 */
public interface IDeptDAO {
    public List<Dept> getAllList();
    public Dept getDeptById(int id);
    public int addDept(Dept dept)throws Exception;

    //根据部门编号，检索部门名称以及该部门下所有员工的信息
    public Dept getEmpsByDeptNo(int deptNo);



}
