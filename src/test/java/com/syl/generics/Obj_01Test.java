package com.syl.generics;

import static org.junit.Assert.*;

public class Obj_01Test {
    public static void main (String[] args) {
        Obj_01 obj_01 = new Obj_01();
        obj_01.say("syl");
        obj_01.say(123);
        obj_01.say(true);
    }

}