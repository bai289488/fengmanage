package com.bai.fengmanage.somelist.entity;

import java.util.Date;

public class DeskList {
    private Integer deskid;

    private String deskname;

    private String deskpic;

    private Date desktime;

    private Integer desknumber;

    private String deskdetail;

    private String deskfrom;

    private Integer parentid;

    private String contenturl;

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public Integer getDeskid() {
        return deskid;
    }

    public void setDeskid(Integer deskid) {
        this.deskid = deskid;
    }

    public String getDeskname() {
        return deskname;
    }

    public void setDeskname(String deskname) {
        this.deskname = deskname == null ? null : deskname.trim();
    }

    public String getDeskpic() {
        return deskpic;
    }

    public void setDeskpic(String deskpic) {
        this.deskpic = deskpic == null ? null : deskpic.trim();
    }

    public Date getDesktime() {
        return desktime;
    }

    public void setDesktime(Date desktime) {
        this.desktime = desktime;
    }

    public Integer getDesknumber() {
        return desknumber;
    }

    public void setDesknumber(Integer desknumber) {
        this.desknumber = desknumber;
    }

    public String getDeskdetail() {
        return deskdetail;
    }

    public void setDeskdetail(String deskdetail) {
        this.deskdetail = deskdetail == null ? null : deskdetail.trim();
    }

    public String getDeskfrom() {
        return deskfrom;
    }

    public void setDeskfrom(String deskfrom) {
        this.deskfrom = deskfrom == null ? null : deskfrom.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}