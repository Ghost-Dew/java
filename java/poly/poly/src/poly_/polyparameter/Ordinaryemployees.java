package poly_.polyparameter;
public class Ordinaryemployees extends Employee{
    public Ordinaryemployees(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println(getName()+"正在工作~~~~~~~~~");
    }


    public double getAnnual() {
        return super.getAnnual();
    }
}
