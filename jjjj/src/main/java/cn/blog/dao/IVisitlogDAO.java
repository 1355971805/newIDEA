package cn.blog.dao;

import cn.blog.entity.visitLog;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by 王 on 2017/7/5.
 */
public interface IVisitlogDAO {
    public boolean addIp(visitLog log) throws Exception;
}
