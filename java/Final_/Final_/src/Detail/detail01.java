package Detail;

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