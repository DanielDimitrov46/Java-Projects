package Exercises.secondTerm.Exercise.Week4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void oldestPerson(ArrayList<Person>people){
        LocalDate max = people.get(0).getBirthDate();
        for (int i = 0; i < people.size(); i++) {
            LocalDate current = people.get(i).getBirthDate();
            if (current.isBefore(max)){
                max = people.get(i).getBirthDate();
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("BEL");
        Person person = new Person();
    Student student = new Student("Daniel", "Dimitrov", LocalDate.of(2006,5,22),20109);
    Teacher teacher = new Teacher("John", "Lenon", LocalDate.of(2004,2,24),subject);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(teacher);
//        System.out.println(people);
        oldestPerson(people);
    }

}
