package com.modifier01;

import com.modifier.A;

public class D {
    public void say(){
        A a = new A();
        System.out.println("a="+a.a);
        //在不同包下只能访问public，不能访问protect,默认,private修饰的属性和方法
        a.m1();
    }
}
