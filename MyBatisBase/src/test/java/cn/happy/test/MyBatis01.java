package cn.happy.test;

import cn.happy.dao.IStudentInfoDao;
import cn.happy.entity.*;
import cn.happy.util.myBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by 王 on 2017/7/10.
 */
public class MyBatis01 {
    @Test
    public void add(){
       StudentInfo info=new StudentInfo();
        info.setStuName("ww");
        info.setStuDate(new Date());
        info.setStuAge("15");
        SqlSession sqlSession = myBatis.getSqlSession();
        IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
        try {
            dao.add(info);
            sqlSession.commit();
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void del(){
        SqlSession sqlSession = myBatis.getSqlSession();
        IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
        dao.delstu(3);
        sqlSession.commit();

        sqlSession.close();
    }
    @Test
    public void upd(){
        StudentInfo info=new StudentInfo();
        info.setStuName("王");
        info.setStuId(4);
        SqlSession sqlSession = myBatis.getSqlSession();
        IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
        dao.updatestu(info);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void  testAll() {
        StudentInfo info=new StudentInfo();
        info.setStuName("庆");
        info.setStuAge("10");
        SqlSession sqlSession = myBatis.getSqlSession();
        IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
        List<StudentInfo> list =dao.getStu(info);
        for (StudentInfo info1:list){
            System.out.println(info1.getStuName());
        }



    }


    @Test
    public void testOneToMany(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        Dept dept = dao.getEmpsByDeptNo(5);
        System.out.println(dept.getDeptName());
        for (Emp emp:dept.getEmps()) {
            System.out.println(emp.getEmpName());
        }

        session.close();
    }
    @Test
    public void testOneToManys(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        Dept dept = dao.getEmpsByDeptNoS(5);
        System.out.println(dept.getDeptName());
        for (Emp emp:dept.getEmps()) {
            System.out.println(emp.getEmpName());
        }
        session.close();
    }

    @Test
    public void testmodify(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
       StudentInfo info=new StudentInfo();
       info.setStuName("庆庆庆");
       info.setStuAge("20");
       info.setStuId(1);
       int aa=dao.modify(info);
        System.out.println(aa);
        session.commit();
        session.close();
    }

    @Test
    public void testmod(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        StudentInfo info=new StudentInfo();
        info.setStuName("庆");
        info.setStuAge("10");
        info.setStuId(1);
        int aa=dao.mod(info);
        System.out.println(aa);
        session.commit();
        session.close();
    }


    //多对一
    @Test
    public void testOneToManyss(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        Emp dept = dao.getEmpNo(2);
        System.out.println(dept.getEmpName());
        System.out.println(dept.getDept().getDeptName());

        session.close();
    }

    @Test
    public void testOneToManysss(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        Emp dept = dao.getEmpNos(2);
        System.out.println(dept.getEmpName());
        System.out.println(dept.getDept().getDeptName());

        session.close();
    }


    //自连接
    @Test
    public void testCate(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        List<Category>list=dao.getCate(1);
        for (Category cate:list
             ) {
            System.out.println(cate);

        }

        session.close();
    }

    //过呢根据老师编号查询对应学生
    @Test
    public void testtss(){
        SqlSession session= myBatis.getSqlSession();
        IStudentInfoDao dao = session.getMapper(IStudentInfoDao.class);
        Teacher teacher=dao.getts(1);
        System.out.println(teacher.getTname());
        for (Students cate:teacher.getStus()
                ) {
            System.out.println(cate.getSname());

        }

        session.close();
    }
}
