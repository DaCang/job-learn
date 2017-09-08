package com.syl.limit;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLimitTest {
    @Test
    public void findBySign () throws Exception {
        int [] a = {13,5,34,11,12,50,18};
        FindLimit fl = new FindLimit(a,"");
        int[] res = fl.findBySign();
        // System.out.println(res[0]+"--"+res[1]+","+res[2]+"--"+res[3]);
        fl.printRes();
    }

    @Test
    public void printRes () throws Exception {
        int [] a = {13,5,34,11,12,50,18};
        FindLimit fl = new FindLimit(a,"aaaaaaaaaaaa");
        int[] res = fl.findBySign();
        // System.out.println(res[0]+"--"+res[1]+","+res[2]+"--"+res[3]);
        fl.printRes();
    }


}