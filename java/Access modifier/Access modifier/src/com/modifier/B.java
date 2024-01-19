package com.modifier;

public class B {
    public void say(){
        A a = new A();
        //在同一个包下可以访问public,protect,默认，不可以访问private
        System.out.println("a="+a.a+" b="+a.b+" c="+a.c);
        a.m1();
        a.m2();
        a.m3();
    }
}
