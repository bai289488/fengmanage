package com.bai.fengmanage.purchaselist.entity;

import java.util.Date;

/**
 * @author admin
 * @version 2018/9/19
 */
public class PurchaseList {

    private Integer pid;

    private String pname;

    private String pdetail;

    private Date pdate;

    private Double pmoney;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Double getPmoney() {
        return pmoney;
    }

    public void setPmoney(Double pmoney) {
        this.pmoney = pmoney;
    }
}
