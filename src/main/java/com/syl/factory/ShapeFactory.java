package com.syl.factory;

import com.syl.duotai.Circle;
import com.syl.duotai.Shape;
import com.syl.duotai.Square;
import com.syl.duotai.Star;

public class ShapeFactory  {

    public  static Shape createShape (String shapeName){

        if("star".equals(shapeName)){
            return  new Star();
        }else if("circle".equals(shapeName)){
            return  new Circle();
        }else if("square".equals(shapeName)){
            return  new Square();
        }else{
            System.out.print("没有你想要的形状,原因是:");
            return  null;
        }
    }
}
