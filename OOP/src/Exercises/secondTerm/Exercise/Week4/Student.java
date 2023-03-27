package Exercises.secondTerm.Exercise.Week4;

import java.time.LocalDate;

public class Student extends Person{
    private int studentNumber;

    public Student(String firstName, String lastName, LocalDate date, int studentNumber) {
        super(firstName, lastName, date);
        this.studentNumber = studentNumber;
    }
    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }


    public Student() {

    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                '}';
    }
}
