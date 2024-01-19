package StaticMethod_;

public class test {
    public static void main(String[] args) {
        Stu jack = new Stu("jack");
//        jack.payFee(200);可以用对象名调用
//        jack.showFee();
        Stu.payFee(200);    //也可以用类名调用（推荐）
        Stu.showFee();
        Stu tom = new Stu("tom");
        Stu.payFee(300);
        Stu.showFee();
    }
}
class Stu{
    private String name;
    private static double fee;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费："+Stu.fee);
    }
}