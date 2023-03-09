package carEx;

public class Car {
    private String brand;
    private String model;

    public Car() {

    }

    public Car(String brand, String model) {
        this.setModel(model);
        this.setBrand(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Brand: " + getBrand() + ", Model: " + getModel();
    }
}
