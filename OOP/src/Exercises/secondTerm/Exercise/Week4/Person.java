package Exercises.secondTerm.Exercise.Week4;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person() {
        this.firstName = "Mama";
        this.lastName = "Vandal";
        this.birthDate = LocalDate.now();
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

    public Person(String firstName, String lastName, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = date;
    }

    @Override
    public String toString() {
        LocalDate now = LocalDate.now();
        long age = java.time.temporal.ChronoUnit.YEARS.between(this.birthDate, now);

        return "Name: " + firstName + " " + lastName + " Age: " + age;
    }

}