package com.syl.refactor;

/**
 * @author syl
 */
public class Obj_01 implements Obj_02 {

    @Override
    public void say (String name){
        System.out.println(name);
    }
    @Override
    public void say (Integer id){
        System.out.println(id);
    }
    @Override
    public void say (Boolean flag){
        System.out.println(flag);
    }
}
