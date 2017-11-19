package cn.happy.service;

import cn.happy.dao.IUserDao;
import cn.happy.entity.Sclass;
import cn.happy.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 王 on 2017/8/9.
 */
public class UserServiceImpl implements IUserService{

    private IUserDao dao;

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }



    public int Login(@Param("n") int n, @Param("p") String p) {
        return dao.Login(n,p);
    }

    public List<Student> setAll() {
        return dao.setAll();
    }

    public int addclass(Sclass sclass) {
        return dao.addclass(sclass);
    }

    public List<Sclass> getAll() {
        return dao.getAll();
    }

    public int addGrade(Student student) {
        return dao.addGrade(student);
    }

    public int delScore(int id) {
        return dao.delScore(id);
    }

    public Student setStu(int id) {
        return dao.setStu(id);
    }

    public int updateScore(Student id) {
        return dao.updateScore(id);
    }

    public List<Student> selectStudent() {
        return dao.selectStudent();
    }
}
