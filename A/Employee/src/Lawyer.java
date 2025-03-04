public class Lawyer extends Employee {

    @Override
    public int getVacationDays() {
        return 15;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    public void sue() {System.out.println("I'll see you in court!");}
}