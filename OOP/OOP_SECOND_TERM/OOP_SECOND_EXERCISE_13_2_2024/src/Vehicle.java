public abstract class Vehicle {
    private double maxspeed;
    private String model;
    private double price;

    public Vehicle(double maxspeed, String model, double price) throws PriceException {
        this.maxspeed = maxspeed;
        this.model = model;
        setPrice(price);
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
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

    public void setPrice(double price) throws PriceException {
        if (price < 0) {
            throw new PriceException("Nee e validno moj");
        } else {
            this.price = price;
        }
    }

    public abstract double checkPromo();
}
