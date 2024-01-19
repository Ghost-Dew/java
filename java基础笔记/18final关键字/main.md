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

