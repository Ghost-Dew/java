package TEXT.text11;

public class test {
    public static void main(String[] args) {
        Person p=new Student();
        p.run();//Student run
        p.eat();//Person eat
        Student stu=(Student) p;
        stu.run();//Student run
        stu.eat();//Person eat
        stu.study();//Student study
    }
}
