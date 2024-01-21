package Interface03;

public interface AInterface {
    public int a=1;
    public void hi();
    default void hello(){
        System.out.println("hello()....");
    }
    public static void say(){
        System.out.println("say()....");
    }
}
