# \Java的动态绑定机制\

1. 当调用对象方法的时候，该方法会和对象的***内存地址/运行类型***绑定
2. 当调用对象属性时，***没有动态绑定机制***，哪里声明，哪里使用。

相关代码如下：

```java
public class Binding {
    public static void main(String[] args) {
        A a = new B();
        //运行类型为B,编译类型为A
        
        //先找B类是否有sum()方法，若没有找父类里的sum()方法，sum()方法里的getI()方法又会继续先在子类里找是否有这个方法（动态绑定机制），但是属性没有动态绑定机制（方法在哪里声明的就调用哪里的属性）
        System.out.println(a.sum());//调用B类的sum()方法输出40->30
        
        //同上述
        System.out.println(a.sum1());//调用B类的sum1()方法输出30->20
    }
}
class A{
    public int i=10;
    public int sum(){
        return getI()+10;
    }
    public int sum1(){
        return i+10;
    }

    public int getI() {
        return i;
    }
}
class B extends A{
    public int i=20;

//    public int sum() {
//        return i+20;
//    }

//    public int sum1() {
//        return i+10;
//    }

    public int getI() {
        return i;
    }
}
```

