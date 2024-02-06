public class Picture {
    private String name;
    private String author;
    private double price;
    private int yearOfCreation;
    private int id = 0;
    public Picture() {
        this.name = "Mona Liza";
        this.author ="Picaso";
        this.price = 20000;
        this.yearOfCreation = 1900;
        this.id = 1;
    }

    public Picture(String name, String author, double price, int yearOfCreation, int id) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.yearOfCreation = yearOfCreation;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearOfCreation=" + yearOfCreation +
                ", id=" + id +
                '}';
    }
}
