public class App {
    public static void main(String[] args) throws NoMoreProductsException {
        Provider provider1 = new Provider("Daniel", "+359888863866");
        Book book1 = new Book("asdasd",22.50,4,provider1,"J.K Rowling", "Harry Potter");
        Electronic electronic1 = new Electronic("jknasddjkna", 233.60, 5, provider1, "Samsung", "Q60");
        System.out.println(book1.getPromotionalPrice());
        System.out.println(electronic1.getPromotionalPrice());
        try {
            System.out.println(book1.sellProduct(2));
        System.out.println(electronic1.sellProduct(2));
        }catch (NoMoreProductsException e){
            System.out.println(e.getMessage());
        }

    }
}