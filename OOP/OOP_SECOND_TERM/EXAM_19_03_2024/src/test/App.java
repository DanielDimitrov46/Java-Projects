package test;

public class App {
    public static void main(String[] args) {
        Library library = new Library("MishetoFly");
        library.addBook();
        library.search("Ivan Vazov");
        library.removeBook("Harry Potter");
        library.removeBookByAuthor("Ivan Vazov");
        library.printBook();

    }
}
