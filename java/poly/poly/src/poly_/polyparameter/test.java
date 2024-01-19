package poly_.polyparameter;

public class test {
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee[] e){
        for (int i = 0; i < e.length; i++) {
            if (e[i] instanceof Ordinaryemployees){
                ((Ordinaryemployees)e[i]).work();
            } else if (e[i] instanceof manage) {
                ((manage)e[i]).manage();
            }
        }
    }
}
