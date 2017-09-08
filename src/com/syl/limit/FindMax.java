package com.syl.limit;

public class FindMax {
    private int [] array;
    public FindMax(int [] array){
        this.array = array;
    }
    public int[] findMax(){
        int maxValue;
        int post=1;
        maxValue=array[0];
        int len = array.length;
        for (int i = 1; i <len ; i++) {
            if(array[i]>maxValue){

                maxValue=array[i];
                post=i+1;
            }
        }
        int [] res={post,maxValue};
        return res;
    }
}
