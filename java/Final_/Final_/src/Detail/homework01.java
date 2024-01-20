package Detail;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class homework01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("圆的面积为："+circle.GetArea());
    }
}
class Circle{
    double r;
    public final double PI;//定义时赋初值=3.14
     {  //代码块赋初值
        PI=3.14;
    }

    public Circle(double r) {//构造器赋初值
         //PI=3.14;
        this.r = r;
    }
    public double GetArea(){
         return PI*r*r;
    }
}