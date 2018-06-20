/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.syl.json;

public class UpData {
    public static void main (String[] args) {

        //http://ch.jims-cloud.com/a/fiance/inpSettleMaster/save?visitNo=201800223
        // &payType=5,1,4
        // &payMoney=2000,1556.11,2607.74
        // &changes=0.00
        // &paymentsMoney=2000.00
        // &totalCharges=6163.85
         String payMoney ="2000,1556.11,2607.74";
         String[] pay=payMoney.split(",");
         Double cost =0.00;
         Double costExact =0.00;

        for (int i = 0; i < pay.length; i++) {
            cost += Double.parseDouble(pay[i]);
            costExact  =NumberUtil.add(Double.parseDouble(pay[i]),costExact);
            System.out.println(cost);
            System.out.println(costExact);
        }
        System.out.println(cost);
        System.out.println(costExact);
    }
}
