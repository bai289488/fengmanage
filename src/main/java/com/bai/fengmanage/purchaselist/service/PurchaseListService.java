package com.bai.fengmanage.purchaselist.service;

import com.bai.fengmanage.purchaselist.entity.PurchaseList;

import java.util.List;

/**
 * @author admin
 * @version 2018/9/19
 */
public interface PurchaseListService {

    List<PurchaseList> getPurchaseList();

    Integer insertPurchaseList(PurchaseList purchaseList);

    String deletePurchaseList(Integer pid);
}
