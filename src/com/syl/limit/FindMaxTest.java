package com.syl.limit;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxTest {
    @Test
    public void findMax () throws Exception {
        int [] a = {13,5,34,11,12,5,18};
        FindMax fm = new FindMax(a);
        int[] max = fm.findMax();
        System.out.println(max[0]+"--"+max[1]);

    }

}