/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.syl.refactor;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author syl
 */
public class Obj_06 {


    /**
     *
     */
    private final ThreadLocal<Boolean> flag = new ThreadLocal<Boolean>();
    /**
     *
     */
    private final AtomicReference<Integer> id = new AtomicReference<Integer>();
    private final MyObj_04 obj_04 = new MyObj_04();
    /**
     *
     */
    private String name;


    public Boolean getFlag () {
        return flag.get();
    }

    public void setFlag (Boolean flag) {
        Obj_06.this.flag.set(flag);
    }

    public Integer getId () {
        return id.get();
    }

    public void setId (Integer id) {
        Obj_06.this.id.set(id);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        Obj_06.this.name = name;
    }

    public void say (String name) {
        obj_04.say(name);
    }

    public void say (Integer id) {
        obj_04.say(id);
    }

    private class MyObj_04 extends Obj_04 {
        /**
         * @param name
         */
        @Override
        public void say (String name){
            Obj_06.this.name = name;
            System.out.println(name);
        }

        /**
         * @param id
         */
        @Override
        public void say (Integer id){
            Obj_06.this.id.set(id);
            System.out.println(id);
        }

        /**
         * @param flag
         */
        @Override
        public void say (Boolean flag){
            Obj_06.this.flag.set(flag);
            System.out.println(flag);
        }
    }
}
