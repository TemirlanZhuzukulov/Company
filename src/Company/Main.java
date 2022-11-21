package Company;

import java.time.LocalDate;
import java.util.Arrays;
import Company.Course;
public class Main {
    public static void main(String[] args) {

        Student student = new Student(1L,"Temirlan Zhuzukulov", 20,'M',12000);
        Student student1 = new Student(2L,"Kanykei Akjoltoi kyzy", 13,'F',12000);
        Student student2 = new Student(3L,"Baiysh Orozaliev", 22,'M',12000);

        Student[] students = {student,student1,student2};
        for (Student s:students) {
            System.out.println((s));
        }


        System.out.println("summa all students:"+Company.income(students));
        Instructor instructor = new Instructor(4L,"Aizhamal Asangazieva", 18, 'F',10000);
        System.out.println(instructor);



        Mentor mentor = new Mentor(7L,"Rahim Kurbanov", 20,'M', 50000);
        Mentor mentor1 = new Mentor(8L,"Maksat Akylberk Uulu", 25,'M', 50000);
        Mentor mentor2 = new Mentor(9L,"Muhammed Toichubai u", 22,'M', 50000);
        Mentor[] mentors = {mentor, mentor1, mentor2};

        Group group = new Group("java-8", students, 1,10);
        Group group1 = new Group("java-8", students, 1,10);
        Group group2 = new Group("java-8", students, 1,10);
        Group[] groups = {group, group1, group2};

        Course course = new Course("java", groups, instructor, mentors);
        Course course1 = new Course("java", groups, instructor, mentors);
        Course course2 = new Course("java", groups, instructor, mentors);
        Course[] courses = {course2, course1, course};

        Company Peaksoft = new Peaksoft("Peaksoft", "Grajdanskay", courses , "java");
        for (Student studen:students) {
            System.out.println("student contract for month:"+studen.getContract());
        }

        for (Mentor ment:mentors) {
            System.out.println("mentor salary for month:"+ment.getSalary());
        }
        for (Student studen:students) {
            System.out.println("student contract for period:"+studen.period(group));

            System.out.println("intstructor salary for period:"+instructor.period(group));

        }
        for (Mentor mentor3:mentors){
            System.out.println("mentor salary for period:"+mentor3.period(group));
        }
        Person[] people = {student,student1,student2, mentor, mentor1, mentor2, instructor};
        sortAge(people);


    }
    public static void sortAge(Person[] person){
        int[] a = new int[person.length];
        int index = 0;
        for (Person persons:person) {
            a[index] = persons.getAge();
            index++;
        }
        Arrays.sort(a);
        System.out.println("age:"+Arrays.toString(a));


    }
}