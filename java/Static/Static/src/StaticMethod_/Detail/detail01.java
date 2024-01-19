package StaticMethod_.Detail;

public class detail01 {
    public static void main(String[] args) {
        //D.say(); 错误非静态方法无法用 类名.方法名调用，要想调用需先创建对象
        D d = new D();
        d.say();
        D.hi(); //静态方法可直接用类名.方法名调用
    }
}
class D{
    private int n1=100;
    private static int n2=200;
    public void say(){
        System.out.println("hello world");
    }
    public static void hi(){
        System.out.println("hi~");
        /*System.out.println(this.n1); 这个用法是错误的，在类方法（静态方法）中不能用
                                       与对象相关的关键字如this，super等
         */
    }

    public static void hello(){     //类方法（静态方法）中只能使用静态变量，静态方法
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);//错误类方法中不能出现与对象相关的关键字
        //say();//错误，类方法中不能调用非静态方法
        hi();
    }
    public void OK(){   //非静态方法既可以访问静态成员，也可以访问非静态成员
        //静态成员->n1，say（）。
        System.out.println(n1);
        say();
        //非静态成员->n2，hi（），hello（）；
        System.out.println(n2);
        hi();
        hello();
    }
}