package TEXT;

public class text02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("jack", 20, "math", 6000);
        teacher.introduce();
    }
}
class Teacher{
    String name;
    int age;
    String post;
    double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println("姓名："+name+" 年龄"+age+" 职称"+post+"工资"+salary);
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary=salary*1.3;
    }

    @Override
    public void introduce() {
        System.out.println("姓名："+name+" 年龄"+age+" 职称"+post+"工资"+salary);
    }
}