package cn.happy.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王 on 2017/7/16.
 */
public class Teacher implements Serializable
{
    private Integer tid;
    private String tname;

    public List<Students> getStus() {
        return stus;
    }

    public void setStus(List<Students> stus) {
        this.stus = stus;
    }

    private List<Students>stus=new ArrayList<Students>();

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }


}
