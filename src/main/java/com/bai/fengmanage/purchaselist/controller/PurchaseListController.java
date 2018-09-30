package com.bai.fengmanage.purchaselist.controller;

import com.bai.fengmanage.purchaselist.entity.PurchaseList;
import com.bai.fengmanage.purchaselist.entity.TingList;
import com.bai.fengmanage.purchaselist.service.PurchaseListService;
import com.bai.fengmanage.purchaselist.service.TingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Controller
@RequestMapping("purchaselist")
public class PurchaseListController {

    @Autowired
    private PurchaseListService purchaseListService;

    @Autowired
    private TingListService tingListService;

    @RequestMapping("getPurchaseLists")
    @ResponseBody
    public List<PurchaseList> getPurchaseLists(){
        List<PurchaseList> list = purchaseListService.getPurchaseList();
        return list;
    }

    @RequestMapping("/{parentid}/getTingList")
    @ResponseBody
    public List<TingList> getTingList(@PathVariable("parentid")Integer parentid){
        List<TingList> list = tingListService.getTingList(parentid);
        return list;
    }

    @RequestMapping("/addpurchase")
    @ResponseBody
    public String addPurchase(String pname,String pdetail,String pdate,Double pmoney)throws Exception{
        PurchaseList pur = new PurchaseList();
        pur.setPname(pname);
        pur.setPdetail(pdetail);
        pur.setPmoney(pmoney);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(pdate);
        pur.setPdate(parse);
        Integer list = purchaseListService.insertPurchaseList(pur);
        if(list==1){
            return "success";
        }else{
            return  "false";
        }
    }

    @RequestMapping("/{parentid}/deletepurchase")
    @ResponseBody
    public String deletepurchase(@PathVariable("parentid")Integer parentid){
        String s = purchaseListService.deletePurchaseList(parentid);
        return s;
    }

}
