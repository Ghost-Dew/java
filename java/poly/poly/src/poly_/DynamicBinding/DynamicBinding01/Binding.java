package poly_.DynamicBinding.DynamicBinding01;

public class Binding {
    public static void main(String[] args) {
        A a = new B();
        //运行类型为B
        System.out.println(a.sum());//调用B类的sum()方法输出40->30
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