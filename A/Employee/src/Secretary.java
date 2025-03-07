// A class to represent employees in general (20-page manual).
public class Secretary extends Employee {
    public Secretary(int years) {
        super(years);
    }

    @Override
    public int getSeniorityBonus() {
        return 0;
    }

    public void takeDictation(String text) {
        System.out.println("Taking dication of text: " + text);
    }
}