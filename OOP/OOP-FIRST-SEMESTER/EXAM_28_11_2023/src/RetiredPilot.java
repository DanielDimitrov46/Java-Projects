import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class RetiredPilot extends Pilot{
    private String retirementYear;

    public RetiredPilot(String name, String specialNumber, String birthDate, int flightHours, String retirementYear) {
        super(name, specialNumber, birthDate, flightHours);
        this.retirementYear = retirementYear;
    }

    public String getRetirementYear() {
        return retirementYear;
    }

    public void setRetirementYear(String retirementYear) {
        this.retirementYear = retirementYear;
    }
    public static RetiredPilot retiredPilotRegistration(Pilot currPilot, BufferedReader scanner) throws IOException {
        String retirementYear = scanner.readLine();
        RetiredPilot retired1 = new RetiredPilot(currPilot.getName(), currPilot.getSpecialNumber(), currPilot.getBirthDate(), currPilot.getFlightHours(), retirementYear);
        return retired1;
    }

    @Override
    public String toString() {
        return "RetiredPilot: "+ getName()+ "Special Number: "+ getSpecialNumber()+ "Birth Year: "+ getBirthDate()+ "FlightHours: "+getFlightHours()+ "Retirement: "+getRetirementYear();
    }
}
