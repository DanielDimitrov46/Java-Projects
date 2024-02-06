public class Car {
    private String model;
    private String brand;
    private double price;
    private String date;
    private String id;

    public Car(String model, String brand, double price, String date, String id) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.date = date;
        this.id = id;
    }
    public Car(){
        this.model = "e46";
        this.brand = "BMW";
        this.price = 25000;
        this.date = "2/2/2002";
        this.id = "N42B20";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
