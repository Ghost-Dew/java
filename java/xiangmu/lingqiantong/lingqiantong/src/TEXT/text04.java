package TEXT;

public class text04 {
    public static void main(String[] args) {
        Teacher_ teacher = new Teacher_("jack", 6000, 30, 120);
        teacher.print();
    }
}
class Employee_{
    String name;
    double salary;

    public Employee_(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void print(){
        System.out.println("姓名："+name+" 全年工资："+salary*12);
    }
}
class Worker_ extends Employee_{
    public Worker_(String name, double salary) {
        super(name, salary);
    }
}
class Peasant extends Employee_{
    public Peasant(String name, double salary) {
        super(name, salary);
    }
}
class Teacher_ extends Employee_{
    int classDay;
    double classSal;

    public Teacher_(String name, double salary, int classDay, double classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public void print() {
        System.out.println("姓名："+name+" 全年工资："+(salary*12+classSal*classDay));
    }
}
class Scientist extends Employee_{
    double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("姓名："+name+" 全年工资："+(salary*12+bonus));
    }
}
class Waiter extends Employee_{
    public Waiter(String name, double salary) {
        super(name, salary);
    }
}