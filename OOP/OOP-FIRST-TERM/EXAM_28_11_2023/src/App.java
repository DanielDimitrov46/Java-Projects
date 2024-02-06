import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        Pilot pilot1 = Pilot.registeringPilot(myReader);
        Pilot pilot2 = new Pilot("Deian", "20111", "2006", 200);
        Pilot pilot3 = new Pilot("Mihaela", "19220", "2005", 192);
        ArrayList<Pilot> allPilotList = new ArrayList<>();
        allPilotList.add(pilot1);
        allPilotList.add(pilot2);
        allPilotList.add(pilot3);

        ArrayList<RetiredPilot> allRetiredPilotList = new ArrayList<>();
        RetiredPilot retiredPilot1 = RetiredPilot.retiredPilotRegistration(pilot1, myReader);
        RetiredPilot retiredPilot2 = RetiredPilot.retiredPilotRegistration(pilot2, myReader);
//        RetiredPilot retiredPilot3 = RetiredPilot.retiredPilotRegistration(pilot3, myReader);
        allRetiredPilotList.add(retiredPilot1);
        allRetiredPilotList.add(retiredPilot2);
//        allRetiredPilotList.add(retiredPilot3);
        System.out.printf("Pilot is active: %b\n", checkPilot(allPilotList, myReader));
        System.out.println(editPilot(allPilotList, myReader).toString());
//        System.out.println(pilot1);
//        System.out.println(pilot1.ageOfPilot(pilot1,2023));
//        System.out.println(retiredPilot1);
        System.out.println(maxFlightHours(allPilotList));
    }

    public static Boolean checkPilot(ArrayList<Pilot> pilot, BufferedReader scanner) throws IOException {
        String searchedNumber = scanner.readLine();
        for (Pilot curr : pilot) {
            if (curr.getSpecialNumber().equals(searchedNumber)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Pilot> editPilot(ArrayList<Pilot> list, BufferedReader scanner) throws IOException {
        System.out.println("enter sepcial number to edit the pilot:");
        String number = scanner.readLine();
        String name = scanner.readLine();
        String specialNumber = scanner.readLine();
        String birthDate = scanner.readLine();
        int flightHours = Integer.parseInt(scanner.readLine());
        for (int i = 0; i < list.size(); i++) {
            Pilot curr = list.get(i);
            if (curr.getSpecialNumber().equals(number)) {
                Pilot changed = new Pilot(name, specialNumber, birthDate, flightHours);
                list.set(i, changed);
            } else {
                list.set(i, curr);
            }
        }
        System.out.println("Object was changed");
        return list;
    }
    public static int maxFlightHours(ArrayList<Pilot> list){
        int maxHours = list.get(0).getFlightHours();
        for (Pilot curr : list) {
            if (curr.getFlightHours() > maxHours) {
                maxHours = curr.getFlightHours();
            }
        }
        return maxHours;
    }

}

