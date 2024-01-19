package poly_.polydetail.detail03;

public class text03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        AA aa=new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false

        String str="hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}
class AA{}
class BB extends AA{}