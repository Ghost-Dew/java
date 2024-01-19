package CodeBlockdetail;
/*
我们看一下创建一个子类对象时(继承关系)，他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，
构造方法的调用顺序如下：
1、父类的静态代码块和静态属性(优先级一样，按定义顺序执行)
2、子类的静态代码块和静态属性(优先级一样，按定义顺序执行)
3、父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
4、父类的构造方法
5、子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
6、子类的构造方法
 */
public class detail04 {
    public static void main(String[] args) {
        new BBBB();//1、AAAA的静态代码块 2、BBBB的静态代码块 3、AAAA的普通代码块 AAAA的无参构造器
                   //4、BBBB的普通代码块 BBBB的无参构造器
    }
}
class AAAA{
    static {
        System.out.println("AAAA的静态代码块");
    }
    {
        System.out.println("AAAA的普通代码块");
    }

    public AAAA() {
        System.out.println("AAAA的无参构造器");
    }
}
class BBBB extends AAAA{
    static {
        System.out.println("BBBB的静态代码块");
    }
    {
        System.out.println("BBBB的普通代码块");
    }

    public BBBB() {
        System.out.println("BBBB的无参构造器");
    }
}