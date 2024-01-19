package poly_.polydetail.exercise;

public class exercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//s的编译类型为Sub所以输出Sub类的count-20
        s.display();//s的运行类型为Sub所以调用的是Sub类的display方法
        Base b = s;//b指向s指向的对象
        System.out.println(b == s);//true
        System.out.println(b.count);//b的编译类型是Base所以输出Base的count-10
        b.display();//b的运行类型为Sub所以调用的是Sub类的display方法
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}