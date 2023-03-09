package Exercises.secondTerm.Exercise.Week1OOP;

public class TemperatureConverter {
    public static double convertFarenheitToCelsius(double temperatureFarenheit){
        double celsius = (temperatureFarenheit-32)*5/9;
        System.out.println("Result in celsius: " + celsius);
        return celsius;
    }
    public static void convertCelsiusToFarenheit(double temperatureCelsius){
        double farenhait = temperatureCelsius*9/5+32;
        System.out.println("Result in farenhait: " + farenhait);
    }
}
