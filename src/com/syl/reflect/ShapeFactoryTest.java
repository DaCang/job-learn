package com.syl.reflect;

import com.syl.duotai.Shape;
import org.junit.Test;

public class ShapeFactoryTest {
    @Test
    public void getAShape ()  {
        draw("star");
        draw("ddd");
        draw("circle");
    }
    public  void draw(String shapeName){
        Shape shape ;
        shape = ShapeFactory.createShape(shapeName);
        try {
            shape.draw();
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("原因:名称指定错误！！！！");
        }
    }


}