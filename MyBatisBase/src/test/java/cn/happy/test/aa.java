package cn.happy.test;

import cn.happy.dao.IStudentInfoDao;
import cn.happy.entity.Dept;
import cn.happy.entity.Emp;
import cn.happy.util.myBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by 王 on 2017/7/19.
 */
public class aa {
    @Test
    public void  aah(){
        SqlSession session = myBatis.getSqlSession();
        IStudentInfoDao dao=session.getMapper(IStudentInfoDao.class);
        Emp no = dao.getEmpNo(2);
        System.out.println(no.getEmpName());
    }
}
