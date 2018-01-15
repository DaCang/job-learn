package com.syl.limit;

public class FindMin {
    private int [] array;
    public FindMin (int [] array){
        this.array = array;
    }
    public int[] findMin(){
        int minValue;
        int post=1;
        minValue=array[0];
        int len = array.length;
        for (int i = 1; i <len ; i++) {
            if(array[i]<minValue){

                minValue=array[i];
                post=i+1;
            }
        }
        int [] res={post,minValue};
        return res;
    }
}
