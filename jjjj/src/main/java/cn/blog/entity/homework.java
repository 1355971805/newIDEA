package cn.blog.entity;

import java.util.Date;

/**
 * Created by 王 on 2017/7/7.
 */
public class homework {
    private int homeId;
            private String homeGrade;
            private  String homeTacher;
            private  String homeChapter;

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public String getHomeGrade() {
        return homeGrade;
    }

    public void setHomeGrade(String homeGrade) {
        this.homeGrade = homeGrade;
    }

    public String getHomeTacher() {
        return homeTacher;
    }

    public void setHomeTacher(String homeTacher) {
        this.homeTacher = homeTacher;
    }

    public String getHomeChapter() {
        return homeChapter;
    }

    public void setHomeChapter(String homeChapter) {
        this.homeChapter = homeChapter;
    }

    public String getHomeContent() {
        return homeContent;
    }

    public void setHomeContent(String homeContent) {
        this.homeContent = homeContent;
    }

    public Date getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(Date homeTime) {
        this.homeTime = homeTime;
    }

    private  String homeContent;
            private Date homeTime;
}
