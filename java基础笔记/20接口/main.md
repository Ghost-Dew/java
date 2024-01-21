# 接口

## 1、基本介绍

接口就是给出一些没有实现的方法封装到一起，到某个类使用时，再根据具体情况把这些方法写出来。

```java
interface 接口名{
    //属性
    //抽象方法（1）抽象方法、（2）默认实现方法（3）静态方法
}
class 类名 implements 接口{
    //自己的属性
    //自己的方法
    //必须实现的接口的方法
}
```

小结：接口时更加抽象的抽象的类，抽象类里的方法可以有方法体，接口里的所有方法都没有方法体【jdk7.0】.接口体现了程序设计的多态的高内聚低耦合的设计思想。特别说明：jdk8.0后接口类可以有：静态方法、（default修饰的方法）默认方法，也就是说接口中可以有方法的具体实现。

## 2、应用场景

现在有一个项目经理管理三个程序员开发一个软件，为了控制和管理软件，项目经理可以定义一些接口，然后由这些程序员具体实现。

例：现有3个程序员，编写3个类，分别完成对MySQL，Oracle，DB2数据库的连接

## 3、接口的注意事项和细节

1. 接口不能被实例化
2. 接口中的所有方法是public方法，接口中抽象方法可以不用abstract修饰。

```java
void aaa();
//在接口中void aaa();实际上就是public abstract void aaa();
```

3. 一个普通类实现接口，就必须将该接口的所有方法都实现。
4. 抽象类实现接口，可以不用实现接口的方法。

5. 一个类同时可以实现多个接口。
6. 接口中的属性只能是final的而且是public static final修饰符。比如：

```java
int a=1;//在接口中实际上为public static final int a=1;（必须初始化）
```

7.  接口中属性的访问形式：接口名.属性名
8. 接口中不能继承其他类，但是可以继承多个别的接口
9. 接口的修饰符只能是public和默认，这点和类的修饰符是一样的。

## 4、课堂练习

接口：

```java
public interface Interface01 {
    int a=23;//等价于public static final int a=23;
}
```

实现接口的类：

```java
public class B implements Interface01{}
```

主函数：

```java
public class test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(Interface01.a);//23
        System.out.println(b.a);//23
        System.out.println(B.a);//23
    }
}
```

## 5、实现接口VS继承类

小结：

+ 当子类继承了父类，就自动拥有了父类的功能
+ 当子类需要拓展功能，可以通过实现接口的方式来扩展
+ 也可以理解为实现接口是对Java但继承机制的一种补充

MonKey类：

```java
public class Monkey {
    public String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println("猴子会爬树...");
    }
}
```

接口A：

```java
public interface Birdable {
    public void flying();
}
```

接口B：

```java
public interface Fishable {
    public void swimming();
}
```

LittleMonkey类：

```java
public class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void climbing() {
        System.out.println(name+"会爬树....");
    }

    @Override
    public void flying() {
        System.out.println(name+"通过学习，学会了飞....");
    }

    @Override
    public void swimming() {
        System.out.println(name+"通过学习，学会了游泳....");
    }

}
```

主函数：

```java
public class test {
    public static void main(String[] args) {
        LittleMonkey monkey = new LittleMonkey("孙悟空");
        monkey.climbing();
        monkey.swimming();
        monkey.flying();
    }
}
```

1. 接口和继承解决的问题不同

+ 继承的价值主要在于：解决代码的复用性和可维护性
+ 接口的价值主要在于：设计，设计好各种规范（方法），让其它类去实现这些方法。即更加的灵活...

2. 接口比继承更加的灵活

+ 继承时满足is-a的关系，而接口只需满足like-a的关系

3. 接口在一定程度上实现代码解耦【即：接口规范性+动态绑定机制】