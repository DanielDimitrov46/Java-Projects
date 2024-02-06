import java.util.Arrays;

public class Student extends Person{
    private int fakNum;
    private Course[] courses;
    private double[] grades;

    public Student(String name, String phoneNumber, int fakNum, Course[] courses, double[] grades) {
        super(name, phoneNumber);
        this.fakNum = fakNum;
        this.courses = courses;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fakNum=" + fakNum +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
