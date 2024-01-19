# 单例模式

## 什么是设计模式？

1. 静态方法和属性的经典使用
2. 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。设计模式就像是经典的棋谱，不同的的棋局，我们用不同的棋谱，免去我们自己在思考和摸索。

## 1、单例设计模式

### 单例（单个的实例）

1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供其对象的实例方法。
2. 单例模式只有两种：饿汉式；懒汉式

### 单例模式的应用实例：

#### （1）饿汉式：

1. 构造器私有化-->防止直接new
2. 在类的内部创建对象
3. 向外暴露一个静态的公共方法。getInstance

```java
public class HungryHanstyle01 {
    public static void main(String[] args) {
        Girlfriend xh = Girlfriend.getXh();
        System.out.println(xh);
        Girlfriend xh1 = Girlfriend.getXh();
        System.out.println(xh1);
        System.out.println(xh==xh1);
    }
}
class Girlfriend{
    private String name;
    //为了能在静态方法中返回gf对象，需要将其修饰为static
    private Girlfriend(String name) {   //1、构造器私有化
        this.name = name;
    }
    private static Girlfriend gf=new Girlfriend("小红"); //2、在类的内部直接创建对象(对象是static)
    public static Girlfriend getXh(){ //3、提供一个公共的static返回gf方法
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

#### （2）懒汉式：

1. 构造器私有化
2. 定义一个static的静态属性对象
3. 提供一个public的static方法，可以返回一个cat随想
4. 懒汉式只有用户使用getCat方法时，才返回Cat对象，后面再次使用时，会返回上次创建的Cat对象

```java
public class Lazystyle01 {
    public static void main(String[] args) {
        Cat cat1=Cat.getCat();
        System.out.println(cat1);
        Cat cat2=Cat.getCat();
        System.out.println(cat2);
        System.out.println(cat1==cat2);//true
    }
}
//懒汉式单例模式
//懒汉式只有用户使用getCat方法时，才返回Cat对象，后面再次使用时，会返回上次创建的Cat对象
class Cat{
    private String name;

    private Cat(String name) { //1、构造器私有化防止直接new
        this.name = name;
    }
    private static Cat cat; //2、定义一个static静态属性对象
    public static Cat getCat(){    //3、提供一个public的static方法，用来返回一个Cat对象
        if (cat==null){
            cat=new Cat("小白");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

#### 饿汉式VS懒汉式

1. 而这最主要的区别是创建对象的时机不同：饿汉式是在类加载的时候就创建了对象实例，懒汉式是在使用时才进行对象的创建
2. 饿汉式不存在线程安全问题，懒汉式存在线程安全问题
3. 饿汉式存在浪费资源的可能，因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费掉了。懒汉式是使用时才进行创建对象就不存在这个问题。
4. 在JavaSE标准类中，java.lang.Runtime就是一个经典的单例模式