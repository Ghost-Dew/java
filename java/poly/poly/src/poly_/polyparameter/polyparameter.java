package poly_.polyparameter;

public class polyparameter {
    public static void main(String[] args) {
        Employee[] e=new Employee[2];
        e[0]=new Ordinaryemployees("jack",3000);
        e[1]=new manage("tom",8000,2000);
        test t = new test();
        for (int i = 0; i < e.length; i++) {
            t.showEmpAnnual(e[i]);
        }
        t.testWork(e);
    }
}
