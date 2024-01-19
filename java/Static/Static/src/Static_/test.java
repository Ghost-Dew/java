package Static_;

public class test {
    public static void main(String[] args) {
        System.out.println(Child.count);
        Child child1 = new Child("jack");
        child1.join();
        child1.count++;
        Child child2 = new Child("tom");
        child2.join();
        child2.count++;
        System.out.println("共有"+Child.count+"位小朋友加入了游戏");
    }
}
