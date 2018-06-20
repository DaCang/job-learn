package com.syl.sort;

import org.junit.Test;


public class BubbleSortTest {
    @Test
    public void bubbleSort () {


        int [] a = {13,5,4,11,2,20,18};
        BubbleSort bs =  new BubbleSort(a);
        //System.out.println("未排序时的结果：");
        bs.bubbleSort();
    }

    public static void main (String[] args) {
        System.out.println("hello world");
    }


}