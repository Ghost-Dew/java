package Object_.finalize_;

public class finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw=null;
        System.gc();
        System.out.println("程序结束");
    }
}
class Car{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了汽车"+name);
        System.out.println("释放了某些资源");
    }
}