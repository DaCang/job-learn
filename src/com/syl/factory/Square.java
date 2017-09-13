package com.syl.factory;

public class Square extends Shape {
    @Override
    public void draw () {
        super.draw();
        System.out.println("我是子类,我知道画什么,我画的是矩形(Square)");
    }
}
