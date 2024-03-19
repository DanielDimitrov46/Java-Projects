import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private static List<Edition> availableEditions;
    private static List<Edition> notInStockEditions;

    public BookStore(List<Edition> availableEditions, List<Edition> notInStockEditions) {
        this.availableEditions = availableEditions;
        this.notInStockEditions = notInStockEditions;
    }

    public static void removeEdition(String id) {
        for (Edition curr : availableEditions) {
            if (curr.getId().equals(id)) {
                availableEditions.remove(curr);
                notInStockEditions.add(curr);
            }
        }
    }

    public static void searchAuthor(Author author) {
        for (Edition curr : availableEditions) {
            if (curr.getAuthorsList().contains(author)) {
                System.out.println(curr);
            }
        }
    }

    public static void searchEdition(Edition edition) throws NoSuchTitleException {
        for (Edition curr : availableEditions) {
            if (curr.getEditionName().equals(edition.getEditionName())) {
                System.out.println(edition + "in available");
                return;
            }
        }
        for (Edition curr : notInStockEditions) {
            if (curr.getEditionName().equals(edition.getEditionName())) {
                System.out.println(edition + "in not available");
                return;
            }
        }
        throw new NoSuchTitleException("The requested edition doensn't exist!");
    }

    public static double incomeCalculation() {
        double result = 0;
        for (Edition curr : availableEditions) {
            result += curr.getQuantity() * curr.getPrice();
        }
        return result;
    }
}
