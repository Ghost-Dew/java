package Object_.objectdetail01;
public class equals01 {
    public static void main(String[] args) {
        B b = new B();
        B c=b;
        B d=c;
        System.out.println(b==c);//true
        System.out.println(d==b);//true
        A a=b;
        System.out.println(a==b);//true
        int n1=10;
        double n2=10.0;
        System.out.println(n1==n2);//true
        "hello".equals("abc");
        Object o = new Object();
        Integer i = new Integer(1000);
        Integer i1 = new Integer(1000);
        System.out.println(i==i1);//false
        System.out.println(i.equals(i1));//true
    }
}
class A{}
class B extends A{}