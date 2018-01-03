package cn.happy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 王 on 2017/7/9.
 */
public class StudentInfo implements Serializable {
private int stuId;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getStuAge() {
        return StuAge;
    }

    public void setStuAge(String stuAge) {
        StuAge = stuAge;
    }

    public Date getStuDate() {
        return StuDate;
    }

    public void setStuDate(Date stuDate) {
        StuDate = stuDate;
    }

    private String StuName;
private String StuAge;
private Date StuDate;
}
