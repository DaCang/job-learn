package com.syl.factory;

import com.syl.duotai.Shape;
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
        Shape shape ;
        shape = ShapeFactory.createShape(shapeName);
        try {
            shape.draw();
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("名称指定错误！！！！");
        }
    }

}