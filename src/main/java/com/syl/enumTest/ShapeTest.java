package com.syl.enumTest;


import org.junit.Test;

public class ShapeTest {
    @Test
    public void draw () throws Exception {

        Shape shape = Shape.STAR;
        shape.draw();
    }

}