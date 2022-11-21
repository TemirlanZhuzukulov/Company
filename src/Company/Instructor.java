package Company;

public class Instructor extends Person{
    private double salary;

    public Instructor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
        double a = group.getDateOfFinish() - group.getDateOfStart();
        return a * getSalary();
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                '}';
    }
}
