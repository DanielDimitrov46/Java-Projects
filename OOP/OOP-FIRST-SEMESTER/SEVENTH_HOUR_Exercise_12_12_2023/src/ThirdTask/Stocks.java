package ThirdTask;

public abstract class Stocks {
    private double price;
    private String numberOfStock;

    public Stocks(double price, String numberOfStock) {
        this.price = price;
        this.numberOfStock = numberOfStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumberOfStock() {
        return numberOfStock;
    }

    public void setNumberOfStock(String numberOfStock) {
        this.numberOfStock = numberOfStock;
    }
    public abstract double checkPromo();
}
