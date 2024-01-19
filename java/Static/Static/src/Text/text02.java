package Text;

public class text02 {
    public static void main(String[] args) {
        System.out.println("Number of total is "+Person.getTotalPerson());//0
        Person person = new Person();//创建了对象，构造器已经调用了此时total=1，id=1
        System.out.println("Number of total is "+Person.getTotalPerson());//1
    }
}
class Person{
    private int id;
    private static int total=0;
    public static int getTotalPerson(){   //静态方法
        //id++; 错误用法，静态方法中无法使用非静态变量
        return total; //total为静态变量，所以在静态方法中可以使用total
    }
    public Person() {
        total++;
        id=total;
    }
}