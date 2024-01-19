package com.modifier;

public class A {
    public int a=100;
    protected int b=200;
    int c=300;
    private int d=400;
    public void m1(){
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
        //在同一个类下可以访问public,protect,默认,private
    }
    protected void m2(){}
    void m3(){}
    private void m4(){}
    public void hi(){
        m1();
        m2();
        m3();
        m4();
    }
}
