package CodeBlockdetail;

public class homework01 {
    public static void main(String[] args) {
        System.out.println("total="+Person.total);
    }
}
class Person{
    public static int total;
    static {
        total=100;
        System.out.println("静态代码块");
    }
}