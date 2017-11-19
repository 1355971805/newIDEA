package cn.blog.dao.iimpl;

import cn.blog.dao.BaseDao;
import cn.blog.dao.IhomeworkDao;
import cn.blog.entity.BlogInfo;
import cn.blog.entity.homework;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王 on 2017/7/7.
 */
public class HomeWorkDaoImpl extends BaseDao implements IhomeworkDao {
    public boolean addList(homework work) throws Exception {
        boolean flag=false;
        String sql="INSERT INTO homework(homeGrade,homeTacher,homeChapter,homeContent,homeTime)VALUES(?,?,?,?,?)";
        Object[]paras={work.getHomeGrade(),work.getHomeTacher(),work.getHomeChapter(),work.getHomeContent(),work.getHomeTime()};
        int count = executeUpdate(sql, paras);
        if (count>0){
            flag=true;
        }
        return flag;
    }
    @Test
    public void getss() throws Exception {
        List<homework> flag=getHome();
        for (homework admins : flag) {
            System.out.print(admins.getHomeGrade());
        }


    }
    public List<homework> getHome() throws Exception {
        List<homework>list=new ArrayList<homework>();
        String sql="select * from homework";
        rs=executeQuery(sql);
        if (rs!=null){
            while (rs.next()){
                homework work=new homework();
                work.setHomeId(rs.getInt("homeId"));
                work.setHomeGrade(rs.getString("homeGrade"));
                work.setHomeTacher(rs.getString("homeTacher"));
                work.setHomeChapter(rs.getString("homeChapter"));
                work.setHomeContent(rs.getString("homeContent"));
                work.setHomeTime(rs.getTime("homeTime"));
                list.add(work);
            }
        }

        return list;
    }
}
