package com.syl.Babylon;

import java.math.BigInteger;

public class BabylonNum {

    BigInteger a;//本数

    int b;//60或60^n的个数

    int c; //位数/n

    int d; // 余数

    String e; //α

    int e1;  //count(α)

    int e2;  //α的位数

    String f; //β

    int f1;  //count(β)

    int f2;  //β的位数

    String   g;  // 最终结果

    public BabylonNum (BigInteger a) {
        this.a = a;
        this.b=a.intValue()/60;

        if(b<10){
            e1=b;
        }else{
            f1=b/10;
        }
    }

    public BigInteger getA () {
        return a;
    }

    public void setA (BigInteger a) {
        this.a = a;
    }

    public int getB () {
        return b;
    }

    public void setB (int b) {
        this.b = b;
    }

    public int getC () {
        return c;
    }

    public void setC (int c) {
        this.c = c;
    }

    public int getD () {
        return d;
    }

    public void setD (int d) {
        this.d = d;
    }

    public String getE () {
        return e;
    }

    public void setE (String e) {
        this.e = e;
    }

    public int getE1 () {
        return e1;
    }

    public void setE1 (int e1) {
        this.e1 = e1;
    }

    public int getE2 () {
        return e2;
    }

    public void setE2 (int e2) {
        this.e2 = e2;
    }

    public String getF () {
        return f;
    }

    public void setF (String f) {
        this.f = f;
    }

    public int getF1 () {
        return f1;
    }

    public void setF1 (int f1) {
        this.f1 = f1;
    }

    public int getF2 () {
        return f2;
    }

    public void setF2 (int f2) {
        this.f2 = f2;
    }

    public String getG () {
        return g;
    }

    public void setG (String g) {
        this.g = g;
    }


    @Override
    public String toString () {
        return  "|   60       |      1     |\n" +
                "|------------|------------|\n" +
                "|    αα      |   βββ      |\n";
        /*return "BabylonNum{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e='" + e + '\'' +
                ", e1=" + e1 +
                ", e2=" + e2 +
                ", f='" + f + '\'' +
                ", f1=" + f1 +
                ", f2=" + f2 +
                ", g='" + g + '\'' +
                '}';*/
    }


}
