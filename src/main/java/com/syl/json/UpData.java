/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.syl.json;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    /**
     * 测试 ||
     */
    @Test
    public void testIfCondition(){

        String remarks =null;
        String remarks1 ="";
        testIfCondition(remarks);
        testIfCondition(remarks1);

    }
    public void testIfCondition(String remarks){
        if(remarks ==null || "".equals(remarks)){
            System.out.println("HERE");
        }
    }
    @Test
    public void testDouble(){
        System.out.println(roundDouble(3.575,100, 2));
    }
    /**
     * 四舍五入保留两位小数
     * @param b1 要保留的参数
     * @param b2 保留位数对应的10的幂数
     * @param scale 保留位数
     * @return
     */
    public  double roundDouble(double b1,double b2,int scale) {
        BigDecimal b = new BigDecimal(b1);
        BigDecimal bc = new BigDecimal(b2);
        double result = b.multiply(bc).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        BigDecimal bigDecimal = new BigDecimal(result);
        return bigDecimal.divide(bc, scale, RoundingMode.HALF_UP).doubleValue();
    }
    @Test
    public void testLoop(){
        int i =10;
        loop:while (i>0){
            if(i%3==0){
                System.out.println(i+" 被 3 整除");
            }
            else if(i%3==1){
                System.out.println(i+" 除 3 余 1");
               // continue loop;  这里无限循环了
            }
            else if(i%3==2){
                System.out.println(i+" 除 3 余 2");
                break  loop;
            }

            i--;

        }
    }
}
