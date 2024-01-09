import java.util.Scanner;

public class BrokenDevice extends Device {
    private String symptoms;
    private int daysForRepair;

    public BrokenDevice(String brand, String model, double price, String symptoms, int daysForRepair) {
        super(brand, model, price);
        this.symptoms = symptoms;
        this.daysForRepair = daysForRepair;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDaysForRepair() {
        return daysForRepair;
    }

    public void setDaysForRepair(int daysForRepair) {
        this.daysForRepair = daysForRepair;
    }

    @Override
    public String toString() {
        return "BrokenDevice{" + this.getBrand() + " " +
                "symptoms='" + symptoms + '\'' +
                ", daysForRepair=" + daysForRepair +
                '}';
    }

    public BrokenDevice createBrokenDevice(Scanner scanner) {
        return new BrokenDevice(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }
}
