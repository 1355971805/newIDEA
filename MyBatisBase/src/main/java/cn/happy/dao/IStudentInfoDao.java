package cn.happy.dao;

import cn.happy.entity.*;
import cn.happy.entity.Category;

import java.util.List;
import java.util.Map;

/**
 * Created by 王 on 2017/7/9.
 */
public interface IStudentInfoDao {
    public List<StudentInfo>getAll();
    public StudentInfo getStudentInfo(int id);
    public int add(StudentInfo info)throws Exception;
    public int delstu(int id);
    public int updatestu(StudentInfo info);
    public List<StudentInfo>getStu(StudentInfo info);

    //多条件查询
    public List<StudentInfo>find(Map<String,Object>map);
    //多条件查询
    public List<StudentInfo>finds(String stuName,int stuAge);
    public List<StudentInfo>fidsif(StudentInfo info);
    public List<StudentInfo>fidsChoose(StudentInfo info);
    public List<StudentInfo>fidsforeach(int[]ids);
    public List<StudentInfo>fidsforeachlist(List<Integer>list);
    public List<StudentInfo>fidsforeachStudent(List<StudentInfo>list);
    public List<StudentInfo>fidsmap(Map<String,Object>map);
    //根据部门编号，检索部门名称以及该部门下所有员工的信息
    public Dept getEmpsByDeptNo(int deptNo);
    //多条sql
    public Dept getEmpsByDeptNoS(int deptNo);

    //if  set
    public int modify(StudentInfo info);

    public int mod(StudentInfo info);


    //多对一
    public Emp getEmpNo(int empNo);
    //多条sql
    public Emp getEmpNos(int empNo);


    //自链接
    public List<Category>getCate(int pid);


    //更具老师编号查询学生
    public Teacher getts(int id);


    public StudentInfo getStudentInfo2(int id);





}
