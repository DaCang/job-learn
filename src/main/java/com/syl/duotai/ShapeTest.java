package com.syl.duotai;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void draw () throws Exception {
        Shape shape ;
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();
        shape = new Star();
        shape.draw();
    }

}