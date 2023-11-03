public class Advertisment {
    private String nameOfAdvertisment;
    private String nameOfAdvertiser;
    private String position;
    private String description;
    private double salary;
    private String city;
    private String contact;

    public Advertisment(String nameOfAdvertisment, String nameOfAdvertiser, String position, String description, double salary, String city, String contact) {
        this.nameOfAdvertisment = nameOfAdvertisment;
        this.nameOfAdvertiser = nameOfAdvertiser;
        this.position = position;
        this.description = description;
        this.salary = salary;
        this.city = city;
        this.contact = contact;
    }

    public String getNameOfAdvertisment() {
        return nameOfAdvertisment;
    }

    public void setNameOfAdvertisment(String nameOfAdvertisment) {
        this.nameOfAdvertisment = nameOfAdvertisment;
    }

    public String getNameOfAdvertiser() {
        return nameOfAdvertiser;
    }

    public void setNameOfAdvertiser(String nameOfAdvertiser) {
        this.nameOfAdvertiser = nameOfAdvertiser;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Advertisment{" +
                "nameOfAdvertisment='" + nameOfAdvertisment + '\'' +
                ", nameOfAdvertiser='" + nameOfAdvertiser + '\'' +
                ", position='" + position + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
