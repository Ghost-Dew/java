package CodeBlockdetail;

public class detail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
/*
创建一个对象时，在一个类的调用顺序是：
1、调用静态代码块和静态属性初始化（静态代码块和静态属性初始化的优先级一样，
   如果调用多个静态代码块和静态属性初始化，则按他们定义的顺序调用）
2、调用普通代码块和普通属性的初始化（普通代码块和普通属性的初始化的优先级一样，如果普通代码块和普通属性的初始化
   则按定义顺序调用）
3、调用构造方法
 */
class A{
    private static int n1=getN1();
    private int n2=getN2();

    {
        System.out.println("我是非静态代码块");
    }

    static {
        System.out.println("A的静态代码块被调用");
    }

    static {
        System.out.println("我是第二个静态代码块");
    }
    public static int getN1(){
        System.out.println("静态方法getN1被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("非静态方法getN2被调用");
        return 200;
    }

    public A() {
        System.out.println("我是构造器");
    }
}