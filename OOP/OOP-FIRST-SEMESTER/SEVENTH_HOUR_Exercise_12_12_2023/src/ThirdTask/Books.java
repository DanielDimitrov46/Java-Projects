package ThirdTask;

public class Books extends Stocks{
    private String author;
    private String title;

    private int discount;

    public Books(double price, String numberOfStock, String author, String title, int discount) {
        super(price, numberOfStock);
        this.author = author;
        this.title = title;
        this.discount = discount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public double checkPromo() {
        double result =  getPrice()*0.91;
        return result;
    }
}
