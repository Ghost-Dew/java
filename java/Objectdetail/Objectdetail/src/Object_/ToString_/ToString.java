package Object_.ToString_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山", 1000);
        System.out.println(monster.toString());
        //Object_.ToString_.Monster@4554617c-->包名.类名@哈希十六进制值
        //当输出一个对象时，ToString方法会被默认调用
        System.out.println(monster);
        //Monster{name='小妖怪', job='巡山', salary=1000.0}
    }
}
class Monster{
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}