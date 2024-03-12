public class Book extends Product{
    private String author;
    private String title;

    public Book(String id, double price, int quantity, Provider provider, String author, String title) {
        super(id, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice()*0.5;
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
