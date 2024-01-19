package TEXT.text13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }


    public String play() {
        return name+"爱玩足球";
    }

    @Override
    public void printInfo() {
        System.out.println("学生的信息：");
        super.printInfo();
        System.out.println("学号："+stu_id);
        study();
        System.out.println(play());
        System.out.println("-------------------------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                ", name='" + name + '\'' +
                '}'+super.toString();
    }
}
