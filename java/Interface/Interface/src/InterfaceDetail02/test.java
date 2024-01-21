package InterfaceDetail02;

public class test {
    public static void main(String[] args) {
        System.out.println(Interface02.n1);//可以用接口直接调用说明n1是static的
        //Interface02.n1=30;不能直接修改n1的值，说明n1是final的
    }
}
