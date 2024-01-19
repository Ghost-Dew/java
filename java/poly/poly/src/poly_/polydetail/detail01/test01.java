package poly_.polydetail.detail01;

public class test01 {
    public static void main(String[] args) {

        //向上转型
        Animal animal = new Cat();
        animal.eat();
        animal.run();
        animal.sleep();
        animal.say();

        //向下转型
        Cat cat=(Cat) animal;
        cat.Catchmice();
    }
}
