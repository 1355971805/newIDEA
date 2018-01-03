package cn.happy.test;


import cn.happy.dao.IStudentInfoDao;
import cn.happy.entity.StudentInfo;
import cn.happy.util.myBatis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.ognl.IntHashMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by 王 on 2017/7/9.
 */
public class MyBatis  extends myBatis{

  @Test
  public void testsss() throws Exception {
    String path="mybatis-config.xml";
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
      StudentInfo list =dao.getStudentInfo(1);
      System.out.println(list.getStuName()+""+list.getStuAge());

      StudentInfo info=new StudentInfo();
      info.setStuName("刘堃");
      info.setStuAge("20");
      info.setStuDate(new Date());
      info.setStuId(1);

      dao.add(info);
    System.out.println("-*------------");
    StudentInfo list1 =dao.getStudentInfo(1);
    System.out.println(list1.getStuName());

  }
  @Test
  public void testssss(){
    String path="mybatis-config.xml";
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
    StudentInfo list =dao.getStudentInfo(1);
    System.out.println(list.getStuName()+""+list.getStuAge());
    sqlSession.close();
    SqlSession sqlSession2 = getSqlSession();
    IStudentInfoDao dao2=sqlSession2.getMapper(IStudentInfoDao.class);
    System.out.println("-*------------");
    StudentInfo list1 =dao2.getStudentInfo(1);
    System.out.println(list1.getStuName());

  }
  //强类型
  @Test
  public void testss(){
    String path="mybatis-config.xml";
    try {
      InputStream is= Resources.getResourceAsStream(path);
      SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
      SqlSession sqlSession=factory.openSession();
      IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
      List<StudentInfo> list =dao.getAll();
      for (StudentInfo dept:list){
        System.out.println(dept.getStuName());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  @Test
    public void  testAll(){
    SqlSession sqlSession = getSqlSession();
    List<StudentInfo> list = sqlSession.selectList("getAll");
      for (StudentInfo info:list) {
        System.out.println(info.getStuName());
      }
    sqlSession.close();


  }
  @Test
  public void  testAlls(){
    SqlSession sqlSession = getSqlSession();
   IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
    Map<String,Object>map=new HashMap<String,Object>();
    map.put("stuName","庆");
    map.put("stuAge",10);
    List<StudentInfo>list=dao.find(map);
    for (StudentInfo stu:list){
      System.out.println(stu.getStuName());
    }
    sqlSession.close();

  }
  @Test
  public void  testAllss(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);

    List<StudentInfo>list=dao.finds("庆",10);
    for (StudentInfo stu:list){
      System.out.println(stu.getStuName());
    }

    sqlSession.close();
  }
  @Test
  public void  testAllsssif(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
    StudentInfo info=new StudentInfo();
    // info.setStuName("庆");
    // info.setStuAge("10");
    List<StudentInfo>list=dao.fidsif(info);
    for (StudentInfo stu:list){
      System.out.println(stu.getStuName());
    }

    sqlSession.close();
  }

  @Test
  public void  dindchoose(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
    StudentInfo info=new StudentInfo();
    info.setStuName("庆");
    // info.setStuAge("10");
    List<StudentInfo>list=dao.fidsChoose(info);
    for (StudentInfo stu:list){
      System.out.println(stu.getStuName());
    }

    sqlSession.close();
  }

  @Test
  public void  dinforeach(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
   int[]ids={1,4};

    List<StudentInfo>list=dao.fidsforeach(ids);
    for (StudentInfo stu:list){
      System.out.println(stu.getStuName());
    }

    sqlSession.close();
  }

  @Test
  public void  dinforeachlist(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
  List<Integer>list=new ArrayList<Integer>();
  list.add(1);
  list.add(4);

    List<StudentInfo>lists=dao.fidsforeachlist(list);
    for (StudentInfo list1:lists){
      System.out.println(list1.getStuName());
    }

    sqlSession.close();
  }

  @Test
  public void  dinforeachliststudent(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
    List<StudentInfo>list=new ArrayList<StudentInfo>();
   StudentInfo info= new StudentInfo();
   info.setStuId(1);
    StudentInfo info1= new StudentInfo();
    info1.setStuId(4);
  list.add(info);
  list.add(info1);

    List<StudentInfo>lists=dao.fidsforeachStudent(list);
    for (StudentInfo list1:lists){
      System.out.println(list1.getStuName());
    }

    sqlSession.close();
  }

  //map
  @Test
  public void ss(){
    SqlSession sqlSession = getSqlSession();
    IStudentInfoDao dao=sqlSession.getMapper(IStudentInfoDao.class);
     List<Integer> ids = new ArrayList<Integer>();
     ids.add(1);
     Map<String, Object> params = new HashMap<String, Object>();
     params.put("ids",ids);
     params.put("stuName","庆");
    List<StudentInfo> infos =dao.fidsmap(params);
    for (StudentInfo info:infos){
      System.out.println(info.getStuName());
    }
  }
}
