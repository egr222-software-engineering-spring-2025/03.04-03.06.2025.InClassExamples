public class EmployeeClient {

    public static void main(String[] args) {
        Employee e = new Employee(3);
        Lawyer l = new Lawyer(12);
        Secretary s = new Secretary(35);
        Marketer m = new Marketer(27);
        LegalSecretary ls = new LegalSecretary(4);

        System.out.println("Employee salary: " + e.getSalary());
        System.out.println("Secretary salary: " + s.getSalary());
        System.out.println("Lawyer salary: " + l.getSalary());
        System.out.println("Marketer salary: " + m.getSalary());
        System.out.println("Legal Secretary salary: " + ls.getSalary());

        System.out.println();

        System.out.println("Employee vacation form: " + e.getVacationForm());
        System.out.println("Secretary vacation form: " + s.getVacationForm());
        System.out.println("Lawyer vacation form: " + l.getVacationForm());
        System.out.println("Marketer vacation form: " + m.getVacationForm());
        System.out.println("Legal Secretary vacation form: " + ls.getVacationForm());

        System.out.println();

        System.out.println("Employee vacation days: " + e.getVacationDays());
        System.out.println("Secretary vacation days: " + s.getVacationDays());
        System.out.println("Lawyer vacation days: " + l.getVacationDays());
        System.out.println("Marketer vacation days: " + m.getVacationDays());
        System.out.println("Legal Secretary vacation days: " + ls.getVacationDays());

        System.out.println();

        s.takeDictation("Meeting notes");
        l.sue();
        m.advertise();
        ls.takeDictation("Legal meeting notes");
        ls.fileLegalBriefs();
    }
}