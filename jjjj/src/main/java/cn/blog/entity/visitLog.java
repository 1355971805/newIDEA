package cn.blog.entity;

import java.util.Date;

/**
 * Created by 王 on 2017/7/5.
 */
public class visitLog {
    private  int LogId;
            private  String IpAddress;

    public int getLogId() {
        return LogId;
    }

    public void setLogId(int logId) {
        LogId = logId;
    }

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public String getProvinceAndCity() {
        return ProvinceAndCity;
    }

    public void setProvinceAndCity(String provinceAndCity) {
        ProvinceAndCity = provinceAndCity;
    }


    public boolean isDel() {
        return IsDel;
    }

    public void setDel(boolean del) {
        IsDel = del;
    }

    private  String ProvinceAndCity;
            private Date VisitTime;

    public Date getVisitTime() {
        return VisitTime;
    }

    public void setVisitTime(Date visitTime) {
        VisitTime = visitTime;
    }

    private  boolean IsDel;


}
