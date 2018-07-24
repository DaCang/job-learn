/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.syl.json;

import org.junit.Test;

public class UpData {
    public static void main (String[] args) {


        // &payMoney=2000,1556.11,2607.74

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

    /**
     * 条件表达式  Conditional expression
     * 三目表达式
     */
    @Test
    public void testConditionalExpression(){

        int a =14;
        //System.out.println(a>20?"大于20":(a>10?"小于20并且大于10":(a>5?"大于5":"小于5")));


        String  chargeType="16";
        String billingAttr ="不计价";
        String ownExpense ="1";
        System.out.println(chargeType=="1"?"1":billingAttr=="不计价"?"2":ownExpense=="1"?"自费":"医保");
    }
}
