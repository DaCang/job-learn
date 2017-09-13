package com.syl.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {
    @Test
    public void getAShape ()  {
        draw("star");
        draw("c");
        draw("circle");
    }
    public  void draw(String shapeName){
        ShapeFactory shapeFactory ;
        shapeFactory = new ShapeFactory();
        Shape shape ;
        shape = shapeFactory.getShape(shapeName);
        try {
            shape.draw();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("名称指定错误！！！！");
        }
    }

}