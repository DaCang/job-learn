package com.syl.Babylon;


import org.junit.Test;

import java.math.BigInteger;

public class BabylonNumTest {


    public static void main (String[] args) {



    }


    @Test
    public  void  m(){

        BigInteger a=new BigInteger("123");

        BabylonNum   babylonNum = new BabylonNum(a);
        System.out.println(babylonNum.toString());



    }

}