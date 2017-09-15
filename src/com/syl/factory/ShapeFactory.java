package com.syl.factory;

class ShapeFactory  {

    static Shape  createShape (String shapeName){

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
