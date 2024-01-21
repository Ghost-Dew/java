# 抽象类

## 1、基本介绍

当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法，这个方法就是抽象方法。用abstract来修饰的类就是抽象类。

## 2、抽象类使用的注意事项的细节讨论

1. 抽象类类不能实例化。
2. 抽象类不一定要包含abstract方法，也就是说抽象类可以没有abstract方法
3. 一旦类包含了abstract方法，则这个类必须声明abstract
4. abstract只能修饰类和方法，不能修饰属性和其他的。
5. 抽象类可以有任意成员（抽象类的本质还是类）。
6. 抽象方法不能有主体，即不能实现。
7. 如果一个类继承了抽象类i，则必须实现抽象类的所有抽象方法。除非他自己也声明为abstract类。
8. 抽象方法不能使用private，final，static来修饰，因为这些关键字都是和重写相违背的。

```java
```

## 3、练习

### 抽象模板模式：

```java
public class main {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.calculate();
        CC cc = new CC();
        cc.calculate();
    }
}
abstract class AA{
    public void calculate(){
        long start=System.currentTimeMillis();
        job();//动态绑定机制
        long end=System.currentTimeMillis();
        System.out.println("执行时间为"+(end-start));
    }
    abstract void job();
}
class BB extends AA{
    @Override
    void job() {
        long sum=0;
        for (long i = 1; i <= 999999999; i++) {
            sum+=i;
        }
    }
}
class CC extends AA{
    @Override
    void job() {
        long sum=1;
        for (long i = 1; i <= 999999999; i++) {
            sum*=i;
        }
    }
}
```

