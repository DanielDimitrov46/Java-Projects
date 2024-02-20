public abstract class Vehicle {
    private String brand;
    private int numberOfPassengers;

    public Vehicle(String brand, int numberOfPassengers) {
        this.brand = brand;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public abstract void accelaration();
}
