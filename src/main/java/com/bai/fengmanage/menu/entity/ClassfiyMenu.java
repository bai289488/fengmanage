package com.bai.fengmanage.menu.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author admin
 * @version 2018/9/13
 */
@Data
@Getter
@Setter
public class ClassfiyMenu {

    private Integer classfiyId;

    private String className;

    private Integer classNum;

    private Date classTime;

    private String classDetail;

    private Integer parentsId;
}
