package com.bai.fengmanage.somelist.entity;

import java.util.Date;

public class PlateList {
    private Integer plateid;

    private String platename;

    private String platepic;

    private Date platetime;

    private Integer platenumber;

    private String platedetail;

    private String platefrom;

    private Integer parentid;

    private String contenturl;

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }


    public Integer getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(Integer platenumber) {
        this.platenumber = platenumber;
    }

    public Integer getPlateid() {
        return plateid;
    }

    public void setPlateid(Integer plateid) {
        this.plateid = plateid;
    }

    public String getPlatename() {
        return platename;
    }

    public void setPlatename(String platename) {
        this.platename = platename == null ? null : platename.trim();
    }

    public String getPlatepic() {
        return platepic;
    }

    public void setPlatepic(String platepic) {
        this.platepic = platepic == null ? null : platepic.trim();
    }

    public Date getPlatetime() {
        return platetime;
    }

    public void setPlatetime(Date platetime) {
        this.platetime = platetime;
    }

    public String getPlatedetail() {
        return platedetail;
    }

    public void setPlatedetail(String platedetail) {
        this.platedetail = platedetail == null ? null : platedetail.trim();
    }

    public String getPlatefrom() {
        return platefrom;
    }

    public void setPlatefrom(String platefrom) {
        this.platefrom = platefrom == null ? null : platefrom.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}