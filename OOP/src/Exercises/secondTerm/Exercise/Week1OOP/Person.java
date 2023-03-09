package Exercises.secondTerm.Exercise.Week1OOP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate year;

    public Person() {
        this.firstName = "Daniel";
        this.lastName = "Dimitrov";
        this.birthDate = LocalDate.of(2006, 5, 22);
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        LocalDate curDate = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate,curDate);
        return "Name: " + firstName +"," + lastName+" Birth Date "+age;
    }
}
