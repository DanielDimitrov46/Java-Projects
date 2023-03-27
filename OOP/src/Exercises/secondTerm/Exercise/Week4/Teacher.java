package Exercises.secondTerm.Exercise.Week4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> subjects;

    public Teacher(String firstName, String lastName, LocalDate date, ArrayList<String> subjects) {
        super(firstName, lastName, date);
        this.subjects = subjects;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                '}';
    }

}
