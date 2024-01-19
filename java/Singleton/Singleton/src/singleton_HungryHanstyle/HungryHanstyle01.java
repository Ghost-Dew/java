package singleton_HungryHanstyle;

public class HungryHanstyle01 {
    public static void main(String[] args) {
        Girlfriend xh = Girlfriend.getXh();
        System.out.println(xh);
        Girlfriend xh1 = Girlfriend.getXh();
        System.out.println(xh1);
        System.out.println(xh==xh1);
    }
}
class Girlfriend{
    private String name;
    //为了能在静态方法中返回gf对象，需要将其修饰为static
    private Girlfriend(String name) {   //1、构造器私有化
        this.name = name;
    }
    private static Girlfriend gf=new Girlfriend("小红"); //2、在类的内部直接创建对象(对象是static)
    public static Girlfriend getXh(){ //3、提供一个公共的static返回gf方法
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}