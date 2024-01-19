package Main01;

public class text {
    private static String name="杜继童";
    private int n1=100;
    public static void hi(){
        System.out.println("Main01中的hi()方法~");
    }
    public void cry(){
        System.out.println("Main01中的cra()方法~");
    }
    public static void main(String[] args) {
        //1、静态方法main 可以直接访问本类的静态成员
        System.out.println("name="+name);
        hi();
        //2、静态方法main 不可以直接访问本类的非静态成员
        //System.out.println("n1="+n1);  错误
        //cry();  错误

        //3、静态方法main 要想调用本类的非静态成员，需要先创建对象在调用即可
        text text = new text();
        System.out.println(text.n1);
        text.cry();
    }
}
