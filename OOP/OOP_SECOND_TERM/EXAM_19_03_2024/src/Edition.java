import java.util.ArrayList;
import java.util.List;

public abstract class Edition {
    private List<Author> authorsList;
    private String editionName;
    private double price;
    private int quantity;

    public Edition(List<Author> authorsList, String editionName,double price, int quantity) {
        this.authorsList = authorsList;
        this.editionName = editionName;
        this.price = price;
        this.quantity = quantity;
    }

    public List<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public String getEditionName() {
        return editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
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

    public abstract String getId();

    @Override
    public String toString() {
        return "Edition{" +
                "authorsList=" + authorsList +
                ", editionName='" + editionName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
