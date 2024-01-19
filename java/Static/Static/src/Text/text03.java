package Text;

public class text03 {
    public static void main(String[] args) {
        Person01.setTotalPerson(3); //此时total=3；
        new Person01(); //创建了对象，构造器调用了一次，此时total=4，id=4
        Person01.getTotal();
    }
}
class Person01{
    private int id;
    private static int total=0;
    public static void setTotalPerson(int total){
        //this.total=total; 错误，因为在静态方法中不能出现与对象相关的关键字，正确代码如下
        Person01.total=total;
    }
    public Person01(){  //构造器
        total++;
        id=total;
    }
    public static void getTotal(){
        System.out.println(Person01.total);
    }
}