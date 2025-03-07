public class Marketer extends Employee {
    public Marketer(int years) {
        super(years);
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }


    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000;   // $10,000 per year more than a basic employee
    }
}
