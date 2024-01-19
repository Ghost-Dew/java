package Singleton_Lazystyle;

public class Lazystyle01 {
    public static void main(String[] args) {
        Cat cat1=Cat.getCat();
        System.out.println(cat1);
        Cat cat2=Cat.getCat();
        System.out.println(cat2);
        System.out.println(cat1==cat2);//true
    }
}
//懒汉式单例模式
//懒汉式只有用户使用getCat方法时，才返回Cat对象，后面再次使用时，会返回上次创建的Cat对象
class Cat{
    private String name;

    private Cat(String name) { //1、构造器私有化防止直接new
        this.name = name;
    }
    private static Cat cat; //2、定义一个static静态属性对象
    public static Cat getCat(){    //3、提供一个public的static方法，用来返回一个Cat对象
        if (cat==null){
            cat=new Cat("小白");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}