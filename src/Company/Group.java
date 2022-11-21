package Company;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String name;
    private Student[]students;
    private int dateOfStart;
    private int dateOfFinish;

    public Group(String name, Student[] students, int dateOfStart, int dateOfFinish) {
        this.name = name;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(int dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", dateOfStart=" + dateOfStart +
                ", dateOfFinish=" + dateOfFinish +
                '}';
    }
}