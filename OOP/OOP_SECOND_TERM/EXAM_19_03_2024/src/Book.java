import java.util.List;

public class Book extends Edition{
    private String ISBN;

    public Book(List<Author> authorsList, String editionName, double price,int quanitity, String ISBN) {
        super(authorsList, editionName, price, quanitity);
        this.ISBN = ISBN;
    }


    @Override
    public String getId() {
        return ISBN;
    }
}
