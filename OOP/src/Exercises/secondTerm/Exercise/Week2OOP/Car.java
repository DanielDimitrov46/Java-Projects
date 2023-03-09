package Exercises.secondTerm.Exercise.Week2OOP;

public class Car {
    private int year;
    private String model;
    private Engine engine;
    private String manufacturer;

    public Car(int year, String model, Engine engine, String manufacturer) {
        this.year = year;
        this.model = model;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }public Car() {
        this.year = 2002;
        this.model = "Terrano";
        this.engine = new Engine();
        this.manufacturer = "Nissan";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
