package encap;

public class encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("哈哈哈哈哈哈哈哈哈");
        person.setAge(200);
        person.setSalary(30000);
        System.out.println(person.info());
        Person person1 = new Person("smith", 200, 50000);
        System.out.println(person1.info());
    }
}
/*不能随便查看人的年龄,工资等隐私,并对设置的年龄进行合理的验证。
年龄合理就设置,否则给默认年龄,必须在 1-120,年龄,工资不能直接查看,
name的长度在 2-6字符 之间*/
class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=6) {
            this.name = name;
        }else{
            System.out.println("输入的名字不规范，长度应在2-6之间，默认为丁真");
            this.name="丁真";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1&&age<=120) {
            this.age = age;
        }else{
            System.out.println("请输入正确的格式，年龄应在1-120，默认为18");
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "name="+name+" age="+age+" salary="+salary;
    }
}