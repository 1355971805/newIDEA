package cn.happy.entity;

import java.io.Serializable;

/**
 * Created by 王 on 2017/7/16.
 */
public class Students implements Serializable
{
    private  Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
