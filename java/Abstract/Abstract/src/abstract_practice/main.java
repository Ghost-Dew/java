package abstract_practice;

public class main {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.calculate();
        CC cc = new CC();
        cc.calculate();
    }
}
abstract class AA{
    public void calculate(){
        long start=System.currentTimeMillis();
        job();//动态绑定机制
        long end=System.currentTimeMillis();
        System.out.println("执行时间为"+(end-start));
    }
    abstract void job();
}
class BB extends AA{
    @Override
    void job() {
        long sum=0;
        for (long i = 1; i <= 999999999; i++) {
            sum+=i;
        }
    }
}
class CC extends AA{
    @Override
    void job() {
        long sum=1;
        for (long i = 1; i <= 999999999; i++) {
            sum*=i;
        }
    }
}