package com.bai.fengmanage.badlist.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author admin
 * @version 2018/9/17
 */

public class BadList {

    private Integer bid;

    private String bname;

    private Date btime;

    private Integer bnumber;

    private String bdetail;

    private Integer btype;

    public Integer getBnumber() {
        return bnumber;
    }

    public void setBnumber(Integer bnumber) {
        this.bnumber = bnumber;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public String getBdetail() {
        return bdetail;
    }

    public void setBdetail(String bdetail) {
        this.bdetail = bdetail;
    }

    public Integer getBtype() {
        return btype;
    }

    public void setBtype(Integer btype) {
        this.btype = btype;
    }
}
