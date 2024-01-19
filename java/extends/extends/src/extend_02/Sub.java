package extend_02;

public class Sub extends Base {
    public Sub() {
        super("smith",10);
        System.out.println("Sub()构造器被调用~~~~~~~~~~~~");
    }
    public Sub(String name){
        super("tom",20);
        System.out.println("Sub(String name)构造器被调用");
    }
    public void say(){
        System.out.println(" "+n1+" "+n2+" "+n3);
        test01();
        test02();
        test03();
        calltest04();
    }
}
