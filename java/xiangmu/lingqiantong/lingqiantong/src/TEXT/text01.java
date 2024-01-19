package TEXT;

public class text01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 18, "学生");
        Person person1 = new Person("tom", 23, "教师");
        Person person2 = new Person("jerry", 20, "厨师");

    }
}
class Person{
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

}