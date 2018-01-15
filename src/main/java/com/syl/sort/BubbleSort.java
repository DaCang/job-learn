package com.syl.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    private int [] array;
    public BubbleSort(int [] array){
        this.array = array;
    }
    //冒泡排序
    public void bubbleSort(){
        // display();
        int temp;
        int len = array.length;
        for(int i=0;i<len-1;i++){  //外层循环：每循环一次就确定了一个相对最大元素
            for(int j=1;j<len-i;j++){  //内层循环：有i个元素已经排好，根据i确定本次的比较次数
                if(array[j-1]>array[j]){  //如果前一位大于后一位，交换位置
                   // System.out.print(array[j-1]+">"+array[j]+"----->交换"+array[j-1]+"和"+array[j]+"的顺序   ");
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;

                }
                display();
            }
            System.out.print("第"+(i+1)+"轮排序结果：");
            display();
        }
    }
    //按顺序打印数组中的元素
    private void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }


}
