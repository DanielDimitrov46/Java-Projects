import java.time.LocalDate;
import java.util.*;

public class Product {
    private String productName;
    private double price;
    private double quantity;
    private LocalDate expirationDate;
    private List<Producer> producers;

    public Product(String productName, double price,double quantity, LocalDate expirationDate, List<Producer> producers) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.producers = new ArrayList<>();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", producers=" + producers +
                '}';
    }

    public static ArrayList<Product> expirationProducts(ArrayList<Product> products) {
        ArrayList<Product> nearExpirationProducts = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (Product curr : products) {
            LocalDate date = curr.getExpirationDate().minusDays(7);
            int result = date.compareTo(currentDate);
            if (result < 0) {
                System.out.println("Product is before today or near today ");
                System.out.println(curr);
                nearExpirationProducts.add(curr);
            } else if (result > 0) {
                System.out.println("Product is after today, so have time");
            } else {
                System.out.println("it perfectly ends today!");
                nearExpirationProducts.add(curr);
            }
        }
        return nearExpirationProducts;
    }

}
