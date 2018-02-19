package com.syl.test;

import org.junit.Test;

public class DemoTest {
    @Test
    public void testValueOfMethod(){
        Object object =null;
        String str1 = String.valueOf(object);
        System.out.println(str1);
    }
}
