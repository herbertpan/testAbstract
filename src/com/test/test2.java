package com.test;
/**
 * Created by panme on 11/3/2016.
 */
public abstract class test2 extends test4{
    static public int abc = 1;
     protected int bcd = 2;
    int cde = 3;
    public abstract int testMethod1();
    abstract int testMethod2();
    protected int testMethod3(int para) {
        System.out.println("protected = " + para);
        return para;
    }
    public int testMethod4(int para) {
        System.out.println("public = " + para);
        return para;
    }
    int testMethod5(int para) {
        System.out.println("default = " + para);
        return para;
    }
}
