package com.syl.enumTest;

public enum Oper {
    D("delete"),I("insert");

    private  String oper;
    Oper (String oper) {
        this.oper = oper;
    }

    public String getOper () {
        return oper;
    }

    public void setOper (String oper) {
        this.oper = oper;
    }
}
