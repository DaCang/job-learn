package com.syl.factory;

class ShapeFactory  {

    Shape getShape (String shapeName){

        if("star".equals(shapeName)){
            return  new Star();
        }else if("circle".equals(shapeName)){
            return  new Circle();
        }else if("square".equals(shapeName)){
            return  new Square();
        }else{
            System.out.println("没有你想要的形状");
            return  null;
        }
    }
}
