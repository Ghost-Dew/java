package super_.super01;

public class B extends A{
    public int n1=500;
    public void test(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3); //super.n4不能访问
        super.test1();
        super.test2();
        super.test3();
        //super.test4(); private的方法无法访问
    }
    public void cal(){
        super.cal();
        System.out.println("我是B类的cal（）方法");
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }

}
