package com.syl.duotai;

public class Circle extends Shape {
    @Override
    public void draw () {
        super.draw();
        System.out.println("我是子类，画圆(Circle)啊");
    }
}
