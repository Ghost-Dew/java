package override;

public class Dog extends Animal{
    /*
    1、因为Dog是Animal的子类
    2、且Dog类的cry方法和Animal的cry定义的形式一样（名称，返回类型和参数）
    3、这时我们就说Dog的cry方法，重写了Animal的cry方法
     */
    public void cry(){
        System.out.println("小狗汪汪叫~~~~~~~~");
    }
    public String m1(){
        return null;
    }
    public AAA m2(){
        return  null;
    }
    public BBB m3(){
        return null;
    }
}
class AAA{

}
class BBB{

}