package Exercises.secondTerm.Exercise.Week2OOP;

public class Engine {
    private double volume;
    private int cylinders;
    private String manufacturer;

    public Engine(double volume, int cylinders, String manufacturer) {
        this.volume = volume;
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
    }

    public Engine() {
        this.volume = 2000;
        this.cylinders = 4;
        this.manufacturer = "BMW";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", cylinders=" + cylinders +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
