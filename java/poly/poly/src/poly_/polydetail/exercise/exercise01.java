package poly_.polydetail.exercise;
public class exercise01 {
    public static void main(String[] args) {
        double d=13.4;
        long l=(long) d;
        System.out.println(l);
        int in=5;
        //boolean b=(boolean) in;
        Object obj="hello";
        String objstr=(String) obj;
        System.out.println(objstr);

        Object objPri=new Integer(5);
        //String str=(String) objPri;
        Integer str1=(Integer) objPri;
    }
}
