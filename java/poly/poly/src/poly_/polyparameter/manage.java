package poly_.polyparameter;

public class manage extends Employee{
    private double bonus;

    public manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+"正在管理~~~~~~~");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
