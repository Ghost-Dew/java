package abstract_;
public class abstract01 {
    public static void main(String[] args) {
        CommonEmployee jack = new CommonEmployee("jack", "00001", 3000);
        Manager tom = new Manager("tom", "0002", 8000, 3000);
        jack.work();
        tom.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract void work();
}
class CommonEmployee extends Employee{  //普通员工

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    void work() {
        System.out.println("普通员工"+getName()+"工作中");
    }
}
class Manager extends Employee{
    double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("经理"+getName()+"工作中");
    }
}