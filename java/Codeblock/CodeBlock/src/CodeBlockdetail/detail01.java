package CodeBlockdetail;

public class detail01 {
    public static void main(String[] args) {
        /*
        1、static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，
           并且只会执行一次。如果是普通代码块，每创建一个对象就执行。
        2、类什么时候被加载【重要！】
           创建对象实例时（new）
           创建子类对象实例，父类也会被加载
           使用类的静态成员时（静态属性，静态方法）
        3、普通的代码块，在创建对象实例时，会被隐式调用。被创建一次就会调用一次
           如果只是使用类的静态成员时，普通代码块并不会执行
        总结如下：
           （1）static代码块是在类加载时，执行，并只会执行一次
           （2）普通代码块是在创建对象时调用的，创建一次，调用一次
           （3）类加载的3种情况非常重要！！！！！！！！！！！
         */
//        new AA();  创建对象实例时（new）
//        new BB();  创建子类对象实例，父类也会被加载
//        System.out.println(Cat.n1);   //使用类的静态成员时（静态属性，静态方法）
        System.out.println(DD.n1);
    }
}
class DD{
    public static int n1=888;
    static {
        System.out.println("DD的静态代码块被调用。。。");
    }
    {
        System.out.println("DD的普通代码块被调用。。。");
    }
}
class AA{
    static {
        System.out.println("AA的静态代码块被执行。。。。");
    }
}
class BB extends AA{
    static {
        System.out.println("BB的静态代码块被执行。。。。");
    }
}
class Animal{
    static {
        System.out.println("Animal的静态代码块被执行。。。。");
    }
}
class Cat extends Animal{
    static int n1=999;
    static {
        System.out.println("Cat的静态代码块被执行。。。。");
    }
}