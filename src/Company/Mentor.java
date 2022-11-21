package Company;

public class Mentor extends Instructor{
    public Mentor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }

    @Override
    public double period(Group group) {
        double a = group.getDateOfFinish() - group.getDateOfStart();

        return a * getSalary();
    }

}
