package cn.blog.dao.iimpl;

import cn.blog.dao.BaseDao;
import cn.blog.dao.IVisitlogDAO;
import cn.blog.entity.visitLog;

/**
 * Created by 王 on 2017/7/5.
 */
public class visitLogDaoImpl extends BaseDao implements IVisitlogDAO{

    public boolean addIp(visitLog log) throws Exception {
        boolean flag=false;
        String sql="INSERT INTO visitlog(IpAddress,VisitTime)values(?,?)";
        Object[]obj={log.getIpAddress(),log.getVisitTime()};
        int count = executeUpdate(sql, obj);
        if (count>0){
            flag=true;
        }
        return flag;
    }
}
