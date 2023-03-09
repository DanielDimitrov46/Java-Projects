package Exercises.secondTerm.Exercise.Week1OOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GreetingsGenerator.greetUser();
        GreetingsGenerator.greetUser("Pesho");
        System.out.println("Temperature");
        double c = TemperatureConverter.convertFarenheitToCelsius(100);
        TemperatureConverter.convertCelsiusToFarenheit(c);
        System.out.println("MATH");
        MyMath.MathMIN(5,10);
        MyMath.MathMAX(5,10);
        MyMath.MathABS(-25);

        System.out.println("OBJECTS");
        Person person = new Person("Mihaela", "Mihaylova", LocalDate.of(2005,10,8));
        System.out.println(person);
    }
}
