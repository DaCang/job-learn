package com.syl.test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DemoTest {

     /**
       * @Title: testValueOfMethod
       * @Description: （test valueOf method）
       * @author 宋永利
       * @date 2018/2/19
       * @throws
      */
    @Test
    public void testValueOfMethod(){
        Object object =null;
        String str1 = String.valueOf(object);
        //这种打印
        //System.out.println(str1);

        try {
            //或者这种
            PrintStream printStream = new PrintStream("a.html");
            printStream.println(object);
        } catch (FileNotFoundException e) {
            System.out.println("a");
            e.printStackTrace();
        }

    }
}
