// A class to represent employees in general (20-page manual).
public class Employee {
    private int years;

    public Employee(int years) {
        this.years = years;
    }

    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 51000.0;      // $51,000.00 / year
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();           // 2 weeks' paid vacation plus seniority bonus
    }

    public int getSeniorityBonus() {
        return 2 * years;
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }

    public int getYears() {
        return years;
    }
}