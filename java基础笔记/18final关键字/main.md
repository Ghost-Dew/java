# final关键字

## 1、基本介绍

final中文意思：最后的，最终的

final可以修饰类、属性、方法和局部变量

### 以下情况可能会用到final：

1. 如果我们要求 A 类不能被其他类继承 可以使用 final 修饰 A 类
2. 如果我们要求 hi 不能被子类重写 可以使用 final 修饰 hi 方法
3. 当不希望类的的某个属性的值被修改,可以用 final 修饰
4. 当不希望某个局部变量被修改，可以使用 final 修饰

```java
package final_;

public class final01_ {
    public static void main(String[] args) {
        E e = new E();
        //e.n1=200;   //当用final修饰类的属性时，这个属性就不能修改了
        System.out.println(e.n1);
    }
}

final class A{    //当我们不希望A类被继承时可以用final来修饰A类，这样其他类就继承不了A类了

}
//class B extends A{} 这样就会报错
class C{
    public final void say(){  //当不希望子类重写这个方法时，可以用final修饰这个方法。
        System.out.println("hello world");
    }
}
class D extends C{
//    public void say() {   //这样就报错了
//        super.say();
//    }
}
class E{
    public final int n1=100;  //当不希望n1被修改时，可以用final修饰这个变量
}
class F{    //当不希望某个局部变量被修改，可以用final修饰该变量
    public void hi(){
        final int n1=100;
        //n1=200;  当用final修饰局部变量时，就不可以修改该变量了
        System.out.println(n1);
    }
}
```

## 2、final使用注意事项和细节讨论

1. final修饰的属性又叫常量，一般用XX_XX_XX来命名
2. final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在以下位置之一：

+ 定义时就赋初值
+ 在构造器中赋初值
+ 在代码块中赋初值

3. 如果final修饰的属性是静态的，则初始化的位置只能是：

+ 定义时赋初值
+ 在静态代码块中赋初值，不能再构造器中赋初值

4. final类不能继承，但是可以实例化对象
5. 如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以继承。

```java
public class detail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        DD dd = new DD();
        dd.hi();
    }
}
class AA{   //final修饰的属性在定义时，必须赋初值，并且让以后不能再修改
    public final double PI=3.14;    //1、在定义时就进行赋初值
    public final double n1;
    public final double n2;
    public AA() {   //2、在构造器赋初值
        n1=0.01;
    }
    {
        n2=0.02;    //3、在代码块赋初值
    }
}
class BB{   //如果final修饰的属性是静态的，则初始化的位置只能是：1、定义时 2、静态代码块中
    public static final double PI=3.14; //1、在定义时
    public static final double n1;
    static {
        n1=0.01;    //因为静态属性在类加载时就需要赋值，静态代码块在类加载时会执行，而构造器只有在创建对象时才会被调用

    }
}
final class CC{   //final类不可以继承但是可以实例化对象

}
class DD{       //如果该类不是final类但是含有final方法，那么该方法不能重写但是可以继承
    public final void hi(){
        System.out.println("我是DD类的final方法");
    }
}
class EE extends DD{    //
//    public final void hi(){   不能重写final修饰的方法，但是可以继承
//        System.out.println("我是EE类的final方法");
//    }
}
```

1. 一般来讲，如果一个类已经是final类了，那么该类的方法就不需要final来修饰了。
2. final不能修饰构造器
3. final和static往往搭配使用，这样效率更高，不会导致类的加载，底层编译器做了优化处理
4. 包装类和String类都是final类

```java
public class detail02 {
    public static void main(String[] args) {
        System.out.println(BBB.n1);
        //包装类，String类都是final类
        //final不能修饰构造器
    }
}
final class AAA{    //一般来讲如果该类已经是final类了，就没有必要将其中的方法也修饰成final了
    public void say(){}
}
class BBB{  //final和static往往搭配使用，效率更高，不会导致类的加载，底层编译器做了优化处理
    final static int n1=100;
    static {
        System.out.println("BBB的静态代码块被执行");
    }
}
```

## 3、final应用实例

### 1、编写一个程序，能够计算圆的面积。

```java
public class homework01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("圆的面积为："+circle.GetArea());
    }
}
class Circle{
    double r;
    public final double PI;//定义时赋初值=3.14
     {  //代码块赋初值
        PI=3.14;
    }

    public Circle(double r) {//构造器赋初值
         //PI=3.14;
        this.r = r;
    }
    public double GetArea(){
         return PI*r*r;
    }
}
```

### 2、下列代码是否有错？

```java
public class homework02 {
    public int addOne(final int x){
        //++x;这里是错误的因为final修饰的不能再修改了
        return x+1;//这里是允许的
    }
    public static void main(String[] args) {

    }
}
```

