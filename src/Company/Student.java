package Company;

public class Student extends Person{
  private double contract;

  public Student(Long id, String fullName, int age, char gender, double contract) {
    super(id, fullName, age, gender);
    this.contract = contract;
  }


  public double getContract() {
    return contract;
  }

  public void setContract(double contract) {
    this.contract = contract;
  }

  @Override
  public double period(Group group) {
    double a = group.getDateOfFinish() - group.getDateOfStart();
    return a * getContract();
  }

  @Override
  public String toString() {
    return "Student{" +
            "contract=" + contract +
            '}'+super.toString();
  }
}

