package poly_.polytext01;
public class poly01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.sum(10,20));
        System.out.println(b.sum(10,20,30));
        b.say();
        A a = new A();
        a.say();
    }
}
class A{    //父类
    public void say(){
        System.out.println("A类的say（）方法被调用");
    }
}
class B extends A{  //子类
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("B类的say（）方法被调用");
    }
}