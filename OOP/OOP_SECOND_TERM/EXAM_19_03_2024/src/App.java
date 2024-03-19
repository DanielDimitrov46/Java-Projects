import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        Author author1 = new Author("J. K. Rowling", "Fantasy writer");
        Author author2 = new Author("Daniel Kraig", "Action writer");
        authorList.add(author1);
        authorList.add(author2);
        List<Edition> availableEditions = new ArrayList<>();
        List<Edition> notInStockEditions = new ArrayList<>();
        try {
            Book book1 = new Book(authorList, "Harry Potter", 24.50, 3, "2525-7343");
            Book book2 = new Book(authorList, "The Lion", 22.50, 4, "");
            Book book3 = new Book(authorList, "The Man", 12.50, 0, "2525-72112");
            availableEditions.add(book1);
            availableEditions.add(book2);
            notInStockEditions.add(book3);
            BookStore bookStore = new BookStore(availableEditions,notInStockEditions);
            BookStore.searchEdition(book1);
            BookStore.searchAuthor(author1);
            ValidateISSN.validateISSN("2525-721212");
            System.out.println(BookStore.incomeCalculation());
        }catch (NoSuchTitleException e){
            System.out.println(e.getMessage());
        }catch (WrongISSNException e){
            System.out.println(e.getMessage());
        }

    }
}