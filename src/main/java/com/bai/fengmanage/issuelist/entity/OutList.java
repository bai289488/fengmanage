package com.bai.fengmanage.issuelist.entity;

import java.math.BigDecimal;

/**
 * @author admin
 * @version 2018/9/27
 */
public class OutList {

    private Integer tid;

    private String tname;

    private BigDecimal tone;

    private Integer tnumber;

    private BigDecimal tall;

    private Integer parentid;

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

    public BigDecimal getTone() {
        return tone;
    }

    public void setTone(BigDecimal tone) {
        this.tone = tone;
    }

    public Integer getTnumber() {
        return tnumber;
    }

    public void setTnumber(Integer tnumber) {
        this.tnumber = tnumber;
    }

    public BigDecimal getTall() {
        return tall;
    }

    public void setTall(BigDecimal tall) {
        this.tall = tall;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

}
