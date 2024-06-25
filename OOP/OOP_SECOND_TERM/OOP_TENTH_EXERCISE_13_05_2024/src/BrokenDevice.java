import java.util.Scanner;

public class BrokenDevice extends Device{
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

    public static void addBrokenDevice(){
        Scanner scanner = new Scanner(System.in);
        BrokenDevice brokenDevice = new BrokenDevice(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    public static void printBrokenDevice(BrokenDevice brokenDevice){
        System.out.println(brokenDevice);
    }
}