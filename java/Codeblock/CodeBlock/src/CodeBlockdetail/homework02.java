package CodeBlockdetail;

public class homework02 {
    public static void main(String[] args) {
        Test a = new Test();
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造器被调用");
    }
}
class Test{
    Sample sam1=new Sample("sam1成员初始化");
    static Sample sam=new Sample("静态成员初始化");
    static {
        System.out.println("static块执行");
        if (sam==null) System.out.println("sam is null");
    }

    public Test() {
        System.out.println("Test默认构造器被调用");
    }
}