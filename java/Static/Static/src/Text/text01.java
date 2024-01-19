package Text;

public class text01 {
    public static int count=9;
    public void count(){
        System.out.println("count="+(count++));
    }
    public static void main(String[] args) {
        new text01().count();   //输出9，count=10；
        new text01().count();   //输出10，count=11；
        System.out.println(text01.count);   //输出11；
    }
}
