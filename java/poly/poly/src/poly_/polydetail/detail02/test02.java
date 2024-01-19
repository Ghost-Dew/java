package poly_.polydetail.detail02;

public class test02 {
    public static void main(String[] args) {
        Base base=new Sub();    //向上转型
        System.out.println(base.count);
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}
