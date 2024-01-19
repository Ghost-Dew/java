package override.text01;

public class text01 {
    public static void main(String[] args) {
        Person person = new Person("小明", 20);
        person.say();
        Student student = new Student("小明", 20, "123456", 100);
        student.say();
    }
}
