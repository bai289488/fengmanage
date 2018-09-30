package com.bai.fengmanage.somelist.entity;

import java.util.Date;

public class DishList {
    private Integer dishid;

    private String dishname;

    private String dishpic;

    private Date dishtime;

    private Integer dishnumber;

    private String dishdetail;

    private String dishfrom;

    private Integer parentid;


    private String contenturl;

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public Integer getDishnumber() {
        return dishnumber;
    }

    public void setDishnumber(Integer dishnumber) {
        this.dishnumber = dishnumber;
    }

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public String getDishpic() {
        return dishpic;
    }

    public void setDishpic(String dishpic) {
        this.dishpic = dishpic == null ? null : dishpic.trim();
    }

    public Date getDishtime() {
        return dishtime;
    }

    public void setDishtime(Date dishtime) {
        this.dishtime = dishtime;
    }

    public String getDishdetail() {
        return dishdetail;
    }

    public void setDishdetail(String dishdetail) {
        this.dishdetail = dishdetail == null ? null : dishdetail.trim();
    }

    public String getDishfrom() {
        return dishfrom;
    }

    public void setDishfrom(String dishfrom) {
        this.dishfrom = dishfrom == null ? null : dishfrom.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}