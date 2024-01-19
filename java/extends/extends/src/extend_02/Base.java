package extend_02;

public class Base extends Topbase{
    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;

    public int getN4() {
        return n4;
    }

//    public Base() {
//        System.out.println("base()构造器被调用~~~~~~~");
//    }
    public Base(String name,int age){
        System.out.println("Base(String name,int age)构造器被调用~~~~~~~~~~~~");
    }
    public void test01(){
        System.out.println("test01");
    }
    protected void test02(){
        System.out.println("test02");
    }
    void test03(){
        System.out.println("test03");
    }
    private void test04(){
        System.out.println("test04");
    }
    public void calltest04(){
        test04();
    }
}
