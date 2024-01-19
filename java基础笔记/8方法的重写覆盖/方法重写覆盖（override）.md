# \方法重写/覆盖（override）\

## 1、基本介绍

方法重写就是子类有一个方法和父类的某个方法的名称、返回类型、参数都一样，我们就说子类的这个方法重写了父类的方法。

## 2、注意事项和使用细节

+ 子类的方法的形参列表、方法名称，要和父类的方法的形参列表、方法名称完全一样。
+ 子类方法的返回类型的父类的方法的返回类型一样，或者是父类返回类型的子类。（父类的返回类型是Object，子类的返回类型是String）
+ 子类方法不能缩小父类方法的访问权限（public->protect->默认->private），子类方法的权限要大于等于父类的访问权限。

```java
//父类的方法权限为public    
public BBB m3(){
        return null;
    }
//子类的方法权限为protect，protect的访问权限要比父类的public权限低所以报错了
    protected BBB m3(){
        return null;
    }
//子类方法的访问权限改为比public权限大或者相等时是对的
    public BBB m3(){
        return null;
    }
```

## 3、练习

编写一个 Person 类，包括属性/private（name、age），构造器、方法 say(返回自我介绍的字符串）。编写一个 Student 类，继承 Person 类，增加 id、score 属性/private，以及构造器，定义 say 方法(返回自我介绍的信息)。 在 main 中,分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍 代码

### (1)编写一个Person类

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void say(){
        System.out.println("我叫"+name+"我今年"+age+"岁了");
    }
}
```

### （2）编写一个Student类继承Person类

```java
public class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void say(){
        System.out.println("我叫"+getName()+"我今年"+getAge()+"岁了");
        System.out.println("我的学号是"+id+"我考了"+score);
    }
}
```

### （3）编写一个主函数(创建两个类的对象调用方法)

```java
public class text01 {
    public static void main(String[] args) {
        Person person = new Person("小明", 20);
        person.say();
        Student student = new Student("小明", 20, "123456", 100);
        student.say();
    }
}
```

