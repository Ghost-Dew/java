package extend_;

public class student {
    String name;
    int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showinfo(){
        System.out.println("学生名："+name+" 年龄："+age+" 成绩："+score);
    }
}
