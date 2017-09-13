package com.syl.factory;

public class Circle extends Shape {
    @Override
    public void draw () {
        super.draw();
        System.out.println("我是之类，画圆(Circle)啊");
    }
}
