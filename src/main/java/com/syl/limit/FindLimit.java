package com.syl.limit;

public class FindLimit {
    private String sign;
    private int [] array;
    public FindLimit(int [] array){//这时默认输出最大值和最小值
        this.array = array;
    }

    public FindLimit (int[] array,String sign ) {//sign(max or min)
        this.sign = sign;
        this.array = array;
    }


    /**
     * @return
     */
    private int[] findMax (){

        return new FindMax(array).findMax();
    }
    /**
     * @return
     */
    private int[] findMin (){

        return new FindMin(array).findMin();
    }

  
    public int[] findBySign(){

         if("max".equals(sign)){
            return  findMax();
        }else if("min".equals(sign))   {
            return findMin();
        }else {
             return  res();
         }
    }
    public static void main (String[] args) {
        int [] a = {13,5,34,11,12,50,18};
        FindLimit fl = new FindLimit(a,"");
        int[] res = fl.findBySign();
       // System.out.println(res[0]+"--"+res[1]+","+res[2]+"--"+res[3]);
        fl.printRes();
    }
    private int[] res(){
        int [] resMax =findMax();
        int [] resMin =findMin();
        int [] res = {resMax[0],resMax[1],resMin[0],resMax[1]};
        return res;
    }

    public void printRes(){
        for (int i: array
             ) {
            System.out.print(i+"\t");
        }
        System.out.println();
        int[] res = findBySign();
        if("max".equals(sign)){
            System.out.println(sign+" is "+res[1]+" at post "+res[0]);
        }else if("min".equals(sign))   {
            System.out.println(sign+" is "+res[1]+" at post "+res[0]);
        }else {
            System.out.println("max is "+res[1]+" at post "+res[0]+" ,min is "+res[3]+" at post "+res[2]);
        }
    }
}
