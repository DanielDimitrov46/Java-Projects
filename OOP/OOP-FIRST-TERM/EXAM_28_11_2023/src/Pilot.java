import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Pilot {
    private String name;
    private String specialNumber;
    private String birthDate;
    private int flightHours;

    public Pilot(String name, String specialNumber, String birthDate, int flightHours) {
        this.name = name;
        this.specialNumber = specialNumber;
        this.birthDate = birthDate;
        this.flightHours = flightHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialNumber() {
        return specialNumber;
    }

    public void setSpecialNumber(String specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    public static Pilot registeringPilot(BufferedReader scanner) throws IOException {
        String name = scanner.readLine();
        String specialNumber = scanner.readLine();
        String birthDate = scanner.readLine();
//        scanner.next();
        int flightHours = Integer.parseInt(scanner.readLine());
        Pilot current = new Pilot(name, specialNumber, birthDate, flightHours);
//        scanner.nextLine();
        return current;
    }

    public int ageOfPilot(Pilot currPilot, int year) {
        int age = year - Integer.parseInt(currPilot.getBirthDate());
        return age;
    }

    @Override
    public String toString() {
        return "Pilot: " +
                "name='" + this.name + '\'' +
                ", specialNumber='" + this.specialNumber + '\'' +
                ", birthDate='" + this.birthDate + '\'' +
                ", flightHours=" + this.flightHours;
    }
}
