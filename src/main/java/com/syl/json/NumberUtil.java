/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.syl.json;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 数字计算类
 */
public class NumberUtil {


	public static double add(Double d1,Double d2){
		return add(d1, d2, 2);
	}

	public static double sub(Double d1,Double d2){
	   return sub(d1, d2,2);
	}

	public static double mul(Double d1,Double d2){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
		return mul(d1, d2, 2);
	}

	public static double div(Double d1,Double d2){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
		return div(d1, d2,2);
	}

	public static double add(Double d1,Double d2,int scale){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
        return decimal1.add(decimal2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();

	}

	public static double sub(Double d1,Double d2,int scale){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
		return decimal1.subtract(decimal2).setScale(scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static double mul(Double d1,Double d2,int scale){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
		return decimal1.multiply(decimal2).setScale(scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static double div(Double d1,Double d2,int scale){
		BigDecimal decimal1 =new BigDecimal(d1);
		BigDecimal decimal2 =new BigDecimal(d2);
		return decimal1.divide(decimal2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}


	public static double round(Double value){
		return new Double( new DecimalFormat( ".00" ).format(value) );
	}

    /**
     * String金额显示2位小数
     * @param value
     * @return
     */
    public static String roundString(String value){
        if(value=="" ||value==null){
            return "";
        }
        Double cny = Double.parseDouble(value);
        value=new DecimalFormat( "0.00" ).format(cny);
        return value;
    }

    /**
     * String金额格式化
     * @param value 字符串
     * @param format 格式化
     * @return
     */
    public static String roundFormat(String value,String format){
        if(value=="" ||value==null){
            return "";
        }
        Double cny = Double.parseDouble(value);
        value=new DecimalFormat(format).format(cny);
        return value;
    }
	public static void main(String[] args) {
		System.out.println(Double.parseDouble("528.30")+Double.parseDouble("27.80"));
	}

}
