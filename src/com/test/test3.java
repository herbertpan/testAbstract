package com.test;

/**
 * Created by panme on 11/3/2016.
 */
public abstract class test3 extends test2{

    @Override
    public int testMethod2() {
        System.out.println("test3 extends test2 implements testMethod2()");
        System.out.println("test3 extends test2 test4abc in test4 = " + test4abc);
        return 0;
    }



}
