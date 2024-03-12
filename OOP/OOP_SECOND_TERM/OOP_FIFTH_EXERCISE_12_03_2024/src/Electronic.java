public class Electronic extends Product{
    private String manufacturer;
    private String model;

    public Electronic(String id, double price, int quantity, Provider provider, String manufacturer, String model) {
        super(id, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice()*0.90;
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        if (getQuantity()-piece>=0){
            return true;
        }else{
            throw new NoMoreProductsException("Product is empty!");
        }
    }
}
