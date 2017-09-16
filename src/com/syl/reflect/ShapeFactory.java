package com.syl.reflect;

import com.syl.duotai.Shape;

class ShapeFactory  {

    static Shape createShape (String shapeName){
        if(shapeName==null||"".equals(shapeName)){
            System.out.println("不能为Null或者空字符串");
            return null;
        }

        String className="com.syl.duotai."+getName(shapeName);

        try {

            Shape shape = (Shape) Class.forName(className).newInstance();
            return  shape;
        } catch (InstantiationException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        } catch (ClassNotFoundException e) {
            System.out.print(className+" 类不存在.");
            return null;
        } finally {
        }

    }
    public static String getName(String name){
        return  name.split("")[1].toUpperCase()+name.substring(1);
    }
}
