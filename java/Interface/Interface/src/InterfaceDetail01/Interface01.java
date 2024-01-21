package InterfaceDetail01;

public interface Interface01 {
    /*
    1、接口不能被实例化
    2、接口中所有方法是public方法，接口中抽象方法，可以不用abstract修饰
    3、一个普通类实现接口，就必须将该接口的所有方法都实现，可以用快捷键alt+inter解决  例如A类
    4、抽象类实现接口可以不用实现接口中的方法  例如B类是抽象类所以可以不用重写接口中的方法
     */
    void say();
    void hi();
}
