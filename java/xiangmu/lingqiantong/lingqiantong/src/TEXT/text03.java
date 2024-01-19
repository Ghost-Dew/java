package TEXT;

public class text03 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", 200, 30);
        Manager manager = new Manager("jerry", 300, 30);
        worker.print();
        manager.print();
    }
}
class Employee{
    String name;
     double salary;
     int day;

    public Employee(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }
    public void print(){
        System.out.println("姓名："+name+" 工资："+salary*day);
    }
}
class Manager extends Employee{
    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    public void print() {
        System.out.println("姓名："+name+" 工资："+(1000+salary*day*1.2));
    }
}
class Worker extends Employee{
    public Worker(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void print() {
        super.print();
    }
}