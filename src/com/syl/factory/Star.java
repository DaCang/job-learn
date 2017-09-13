package com.syl.factory;

public class Star extends Shape {
    @Override
    public void draw () {
        super.draw();
        System.out.println("哈哈哈，我知道我画的是星星(Star)！！！");
    }
}
