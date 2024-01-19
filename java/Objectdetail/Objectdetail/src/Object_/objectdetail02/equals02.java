package Object_.objectdetail02;

public class equals02 {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 18, '男');
        Person person2 = new Person("张三", 20, '男');
        System.out.println(person1.equals(person2));
    }
}