package cn.happy.service;

import cn.happy.entity.Sclass;
import cn.happy.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 王 on 2017/8/9.
 */
public interface IUserService {
    public int Login(@Param("n") int n, @Param("p") String p);
    public List<Student> setAll();


    public int addclass(Sclass sclass);

    public List<Sclass>getAll();

    public int addGrade(Student student);


    public int delScore(int id);

    public  Student setStu(int id);


    public int updateScore(Student id);

    public List<Student>selectStudent();
}
