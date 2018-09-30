package com.bai.fengmanage.purchaselist.service.impl;

import com.bai.fengmanage.purchaselist.entity.PurchaseList;
import com.bai.fengmanage.purchaselist.entity.TingList;
import com.bai.fengmanage.purchaselist.mapper.PurchaseListMapper;
import com.bai.fengmanage.purchaselist.mapper.TingListMapper;
import com.bai.fengmanage.purchaselist.service.PurchaseListService;
import com.bai.fengmanage.somelist.entity.*;
import com.bai.fengmanage.somelist.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
@Service
@Transactional
public class PurchaseListServiceImpl implements PurchaseListService {

    @Autowired
    private PurchaseListMapper purchaseListMapper;

    @Autowired
    private TingListMapper tingListMapper;

    @Autowired
    private DeskListMapper deskListMapper;

    @Autowired
    private ChairListMapper chairListMapper;

    @Autowired
    private DishListMapper dishListMapper;

    @Autowired
    private PlateListMapper plateListMapper;

    @Autowired
    private SticksListMapper sticksListMapper;

    @Override
    public List<PurchaseList> getPurchaseList() {
        List<PurchaseList> lists = purchaseListMapper.queryList();
        return lists;
    }

    @Override
    public Integer insertPurchaseList(PurchaseList purchaseList) {
        Integer jieguo = 0;
        List<TingList> things = new ArrayList<>();
        String pdetail = purchaseList.getPdetail();
        String[] split = pdetail.split(",");
        Integer list = purchaseListMapper.addPurchaseList(purchaseList);
        double st = 0.00;
        for(String s:split){
            String[] ss = s.split("-");
                TingList tl = new TingList();
                tl.setTnumber(Integer.parseInt(ss[0]));
                tl.setTname(ss[2]);
                BigDecimal bd = new BigDecimal(ss[3]);
                BigDecimal bd2 = new BigDecimal(Integer.parseInt(ss[0]));
                tl.setTone(bd);
                tl.setTall(bd.multiply(bd2));
                double v = bd.multiply(bd2).doubleValue();
                st+=v;
                 tl.setParentid(purchaseList.getPid());
                things.add(tl);

             if(Integer.parseInt(ss[1])==1){        //桌子
                 DeskList deskList = deskListMapper.queryByName(ss[2], 7);
                 DeskList del = new DeskList();
                 if(deskList==null){
                     del.setDeskname(ss[2]);
                     del.setDesknumber(Integer.parseInt(ss[0]));
                     del.setDeskfrom(ss[4]);
                     del.setDesktime(purchaseList.getPdate());
                     deskListMapper.addDeskList(del);
                 }else{
                     del.setDeskid(deskList.getDeskid());
                     del.setDeskname(ss[2]);
                     del.setDesknumber(deskList.getDesknumber()+Integer.parseInt(ss[0]));
                     del.setDeskfrom(ss[4]);
                     del.setDesktime(purchaseList.getPdate());
                     deskListMapper.updateDesk(del);
                 }
             }else if(Integer.parseInt(ss[1])==2){    //椅子
                 ChairList chairList = chairListMapper.queryByName(ss[2], 8);
                 ChairList cha = new ChairList();
                 if(chairList==null){
                     cha.setChairname(ss[2]);
                     cha.setChairnumber(Integer.parseInt(ss[0]));
                     cha.setChairfrom(ss[4]);
                     cha.setChairtime(purchaseList.getPdate());
                     chairListMapper.addChairs(cha);
                 }else{
                     cha.setChairid(chairList.getChairid());
                     cha.setChairname(ss[2]);
                     cha.setChairnumber(cha.getChairnumber()+Integer.parseInt(ss[0]));
                     cha.setChairfrom(ss[4]);
                     cha.setChairtime(purchaseList.getPdate());
                     chairListMapper.updateChair(cha);
                 }
             }else if(Integer.parseInt(ss[1])==3){     //盘子
                 DishList dishList = dishListMapper.queryByName(ss[2], 9);
                 DishList dis = new DishList();
                 if(dishList==null){
                     dis.setDishname(ss[2]);
                     dis.setDishnumber(Integer.parseInt(ss[0]));
                     dis.setDishfrom(ss[4]);
                     dis.setDishtime(purchaseList.getPdate());
                     dishListMapper.addDish(dis);
                 }else{
                     dis.setDishid(dishList.getDishid());
                     dis.setDishname(ss[2]);
                     dis.setDishnumber(dishList.getDishnumber()+Integer.parseInt(ss[0]));
                     dis.setDishfrom(ss[4]);
                     dis.setDishtime(purchaseList.getPdate());
                     dishListMapper.updatedish(dis);
                 }

             }else if(Integer.parseInt(ss[1])==4){     //碟子
                 PlateList plateList = plateListMapper.queryByName(ss[2], 10);
                 PlateList pla = new PlateList();
                 if(plateList==null){
                     pla.setPlatename(ss[2]);
                     pla.setPlatenumber(Integer.parseInt(ss[0]));
                     pla.setPlatefrom(ss[4]);
                     pla.setPlatetime(purchaseList.getPdate());
                     plateListMapper.addplate(pla);
                 }else{
                     pla.setPlateid(plateList.getPlateid());
                     pla.setPlatename(ss[2]);
                     pla.setPlatenumber(plateList.getPlatenumber()+Integer.parseInt(ss[0]));
                     pla.setPlatefrom(ss[4]);
                     pla.setPlatetime(purchaseList.getPdate());
                     plateListMapper.updatePlate(pla);
                 }
             }else if(Integer.parseInt(ss[1])==5){     //筷子
                 SticksList sticksList = sticksListMapper.queryByName(ss[2], 11);
                 SticksList stl = new SticksList();
                 if(sticksList==null){
                     stl.setSticksname(ss[2]);
                     stl.setSticksnumber(Integer.parseInt(ss[0]));
                     stl.setSticksfrom(ss[4]);
                     stl.setStickstime(purchaseList.getPdate());
                     sticksListMapper.addsticks(stl);
                 }else{
                     stl.setSticksid(sticksList.getSticksid());
                     stl.setSticksname(ss[2]);
                     stl.setSticksnumber(sticksList.getSticksnumber()+Integer.parseInt(ss[0]));
                     stl.setSticksfrom(ss[4]);
                     stl.setStickstime(purchaseList.getPdate());
                     sticksListMapper.updateSticks(stl);
                 }
             }else if(Integer.parseInt(ss[1])==6){    //其他

             }

        }
        if(st==purchaseList.getPmoney()){
            System.out.println("============================");
        }else{
            System.out.println("---------------------------");
        }

        for(int i=0;i<things.size();i++){
            Integer list1 = tingListMapper.addTingList(things.get(i));
            jieguo+=list1;
        }

        if(jieguo!=things.size()||list==null){
            return 0;
        }
        return 1;
    }

    @Override
    public String deletePurchaseList(Integer pid) {
        Integer list = purchaseListMapper.deletePurchaseList(pid);
        Integer result = tingListMapper.deleteTingList(pid);
        if(list!=null||result!=null){
            return "false";
        }
        return "success";
    }
}
