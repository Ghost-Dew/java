package InterfaceDetail02;

public class A implements Interface02,Interface03 { //一个类可以实现多个接口

    @Override
    public void hi() {
        System.out.println("hi()....");
    }

    @Override
    public void say() {
        System.out.println("say()....");
    }
}
