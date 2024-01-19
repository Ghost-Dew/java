package poly_;
public class poly01 {
    public static void main(String[] args) {
        Master master = new Master("张三");
        Dog dog = new Dog("小白");
        Bone bone = new Bone("骨头");
        master.feed(dog,bone);
        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        master.feed(cat,fish);
//        Master master = new Master("李四");
//        Animal animal = new Cat("小黑");
//        Food food = new Fish("草鱼");
//        master.feed(animal,food);
//        animal=new Dog("小黄");
//        food=new Bone("大骨头");
//        master.feed(animal,food);
    }
}
