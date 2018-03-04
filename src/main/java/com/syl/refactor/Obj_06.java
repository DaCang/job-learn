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
public class Obj_06 extends Obj_04 {


    /**
     *
     */
    private final ThreadLocal<Boolean> flag = new ThreadLocal<Boolean>();
    /**
     *
     */
    private final AtomicReference<Integer> id = new AtomicReference<Integer>();
    /**
     *
     */
    private String name;


    /**
     * @param name
     */
    @Override
    public void say (String name){
        this.name = name;
        System.out.println(name);
    }

    /**
     * @param id
     */
    @Override
    public void say (Integer id){
        this.id.set(id);
        System.out.println(id);
    }

    /**
     * @param flag
     */
    @Override
    public void say (Boolean flag){
        this.flag.set(flag);
        System.out.println(flag);
    }


    public Boolean getFlag () {
        return flag.get();
    }

    public void setFlag (Boolean flag) {
        this.flag.set(flag);
    }

    public Integer getId () {
        return id.get();
    }

    public void setId (Integer id) {
        this.id.set(id);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
