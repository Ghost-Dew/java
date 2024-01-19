package override.text01;

public class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void say(){
        System.out.println("我叫"+getName()+"我今年"+getAge()+"岁了");
        System.out.println("我的学号是"+id+"我考了"+score);
    }
}
