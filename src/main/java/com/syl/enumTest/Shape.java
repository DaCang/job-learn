package com.syl.enumTest;

public  enum  Shape {

    CIRCLE("圆"){
        @Override
        public void draw () {
            super.draw("我是子类，画圆(Circle)啊");
        }
    },SQUARE("矩形"){
        @Override
        public void draw () {
            super.draw("我是子类,我知道画什么,我画的是矩形(Square)");
        }
    },STAR("星星"){
        @Override
        public void draw () {
            super.draw("哈哈哈，我知道我画的是星星(Star)！！！");
        }
    };
    private String shapeName;

    Shape (String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName () {
        return shapeName;
    }

    public void setShapeName (String shapeName) {
        this.shapeName = shapeName;
    }
    public abstract void draw();

    public  void draw(String msg){
        System.out.println(msg);
    }
}
