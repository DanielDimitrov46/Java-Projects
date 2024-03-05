public class Car {
    private String brand;
    private String model;
    private double price;
    private String dateOfManufacture;
    private String fuel;
    private String serialNumber;

    public Car(String brand, String model, double price, String dateOfManufacture, String fuel, String serialNumber) throws InvalidCarParametersException {
        this.brand = brand;
        this.model = model;
        setPrice(price);
        this.dateOfManufacture = dateOfManufacture;
        this.fuel = fuel;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws InvalidCarParametersException {
        if(brand.isEmpty()){
            throw new InvalidCarParametersException("Invalid brand!");
        }else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidCarParametersException {
        if (price<=0){
            throw new InvalidCarParametersException("Invalid price!");
        }else{
            this.price = price;
        }
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", fuel='" + fuel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
