package com.use;

import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);    //com.xiaoming.Dog@4554617c
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1);   //com.xiaoqiang.Dog@74a14482
    }
}
