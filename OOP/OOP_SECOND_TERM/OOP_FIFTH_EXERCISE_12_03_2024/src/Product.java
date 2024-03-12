public abstract class Product {
    private String id;
    private double price;
    private int quantity;
    private Provider provider;

    public Product(String id, double price, int quantity, Provider provider) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public abstract double getPromotionalPrice();
    public abstract boolean sellProduct(int piece) throws NoMoreProductsException;


}
