package com.bai.fengmanage.issuelist.entity;


import java.util.Date;

/**
 * @author admin
 * @version 2018/9/27
 */
public class IssueList {

    private Integer iid;

    private String iname;

    private String idetail;

    private Date itime;

    private Integer istatue;

    private Double imoney;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIdetail() {
        return idetail;
    }

    public void setIdetail(String idetail) {
        this.idetail = idetail;
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public Integer getIstatue() {
        return istatue;
    }

    public void setIstatue(Integer istatue) {
        this.istatue = istatue;
    }

    public Double getImoney() {
        return imoney;
    }

    public void setImoney(Double imoney) {
        this.imoney = imoney;
    }
}
