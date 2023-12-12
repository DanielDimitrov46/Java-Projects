package ThirdTask;

public class Tv extends Stocks{
    private String manufacturer;
    private String model;
    private int power;

    public Tv(double price, String numberOfStock, String manufacturer, String model, int power) {
        super(price, numberOfStock);
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public double checkPromo() {
        double result =  getPrice()*0.75;
        return result;
    }
}
