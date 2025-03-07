public class Lawyer extends Employee {

    public Lawyer(int years) {
        super(years);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 5000 * getYears();
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    public void sue() {System.out.println("I'll see you in court!");}
}