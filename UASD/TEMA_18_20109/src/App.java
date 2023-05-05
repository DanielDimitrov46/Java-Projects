import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Integer, String> monthsWithNumbers = new Hashtable<>(12);

        monthsWithNumbers.put(1, "January");
        monthsWithNumbers.put(2, "February");
        monthsWithNumbers.put(3, "March");
        monthsWithNumbers.put(4, "April");
        monthsWithNumbers.put(5, "May");
        monthsWithNumbers.put(6, "June");
        monthsWithNumbers.put(7, "July");
        monthsWithNumbers.put(8, "August");
        monthsWithNumbers.put(9, "September");
        monthsWithNumbers.put(10, "October");
        monthsWithNumbers.put(11, "November");
        monthsWithNumbers.put(12, "December");
        System.out.println(monthsWithNumbers);

        System.out.println("Input 1. for searching by key // 2 for searching by value : ");
        int choise = Integer.parseInt(reader.readLine());

        if (choise == 1) {
            System.out.println("Input key : ");
            int searchKey = Integer.parseInt(reader.readLine());
            System.out.println(monthsWithNumbers.get(searchKey));
        } else if (choise == 2) {
            System.out.println("Input value : ");
            String searchValue = reader.readLine().toLowerCase();

            Enumeration<String> monthsValues = monthsWithNumbers.elements();
            Enumeration<Integer> monthsKeys = monthsWithNumbers.keys();


            while (monthsValues.hasMoreElements()) {

                Integer currKey = monthsKeys.nextElement();
                String currMonth = monthsValues.nextElement();

                if (currMonth.toLowerCase().equals(searchValue)) {
                    System.out.println(currKey);
                }
            }
        } else {
            System.out.println("Not such command");
        }
    }
}
