package com.bai.fengmanage.somelist.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author admin
 * @version 2018/9/17
 */
@Data
public class SticksList {

    private Integer sticksid;

    private String sticksname;

    private String stickspic;

    private Integer sticksnumber;

    private Date stickstime;

    private String sticksdetail;

    private String sticksfrom;

    private Integer parentid;

    public Integer getSticksid() {
        return sticksid;
    }

    public void setSticksid(Integer sticksid) {
        this.sticksid = sticksid;
    }

    public String getSticksname() {
        return sticksname;
    }

    public void setSticksname(String sticksname) {
        this.sticksname = sticksname;
    }

    public String getStickspic() {
        return stickspic;
    }

    public void setStickspic(String stickspic) {
        this.stickspic = stickspic;
    }

    public Integer getSticksnumber() {
        return sticksnumber;
    }

    public void setSticksnumber(Integer sticksnumber) {
        this.sticksnumber = sticksnumber;
    }

    public Date getStickstime() {
        return stickstime;
    }

    public void setStickstime(Date stickstime) {
        this.stickstime = stickstime;
    }

    public String getSticksdetail() {
        return sticksdetail;
    }

    public void setSticksdetail(String sticksdetail) {
        this.sticksdetail = sticksdetail;
    }

    public String getSticksfrom() {
        return sticksfrom;
    }

    public void setSticksfrom(String sticksfrom) {
        this.sticksfrom = sticksfrom;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
