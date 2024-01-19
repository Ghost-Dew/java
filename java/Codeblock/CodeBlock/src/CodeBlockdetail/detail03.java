package CodeBlockdetail;

public class detail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }

    public AAA() {
        System.out.println("AAA的无参构造器");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }

    public BBB() {
        //super();
        //本类的普通代码块
        System.out.println("BBB的无参构造器");
    }
}