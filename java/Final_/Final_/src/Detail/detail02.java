package Detail;

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