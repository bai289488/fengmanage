package com.bai.fengmanage.somelist.entity;

import java.util.Date;

public class ChairList {
    private Integer chairid;

    private String chairname;

    private String chairpic;

    private Date chairtime;

    private Integer chairnumber;

    private String chairdetail;

    private String chairfrom;

    private Integer parentid;

    private String contenturl;

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public Integer getChairnumber() {
        return chairnumber;
    }

    public void setChairnumber(Integer chairnumber) {
        this.chairnumber = chairnumber;
    }

    public Integer getChairid() {
        return chairid;
    }

    public void setChairid(Integer chairid) {
        this.chairid = chairid;
    }

    public String getChairname() {
        return chairname;
    }

    public void setChairname(String chairname) {
        this.chairname = chairname == null ? null : chairname.trim();
    }

    public String getChairpic() {
        return chairpic;
    }

    public void setChairpic(String chairpic) {
        this.chairpic = chairpic == null ? null : chairpic.trim();
    }

    public Date getChairtime() {
        return chairtime;
    }

    public void setChairtime(Date chairtime) {
        this.chairtime = chairtime;
    }

    public String getChairdetail() {
        return chairdetail;
    }

    public void setChairdetail(String chairdetail) {
        this.chairdetail = chairdetail == null ? null : chairdetail.trim();
    }

    public String getChairfrom() {
        return chairfrom;
    }

    public void setChairfrom(String chairfrom) {
        this.chairfrom = chairfrom == null ? null : chairfrom.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}