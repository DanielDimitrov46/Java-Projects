import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Ex2PravetsStudents {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(reader.readLine());
        ArrayList<Double> gradesDouble;
        HashMap<String, ArrayList<Double>> studentGrades = new HashMap<String, ArrayList<Double>>();
        for (int i = 0; i < numberOfStudents; i++) {
            String gradesString = reader.readLine();
            String[] allGrades = gradesString.split(", ");
            gradesDouble = new ArrayList<Double>();
//            Integer[] gradesDouble = new Integer[gradesString.length];
            for (int j = 0; j < allGrades.length; j++) {
                try {
                    if (allGrades[j].length()>1){
                        if (allGrades[j].charAt(1)==','){
                            allGrades[j]=allGrades[j].replace(allGrades[j].charAt(1),' ');
                        }
                    }
                    gradesDouble.add(Double.parseDouble(allGrades[j]));
//                    gradesDouble[j] = Integer.parseInt(gradesString[j]);
                } catch (NumberFormatException nfe) {
                    gradesDouble.add(j,null);
//                    gradesDouble[j] = null;
                }
            }
            String name = reader.readLine();
            if (!studentGrades.containsKey(name)){
                studentGrades.put(name, gradesDouble);
            }
        }
        HashMap<String, Double> averageStudentGrades = new HashMap<String, Double>();
        for (int i = 0; i < studentGrades.size(); i++) {
            for(Entry<String, ArrayList<Double>> entry: studentGrades.entrySet()) {
            String name = entry.getKey();
            ArrayList<Double> current = entry.getValue();
            double sum = 0;
            for (double grade:
                 current) {
                sum +=grade;
            }
                double average = sum/current.size();
            if (average>=4.00){
                averageStudentGrades.put(name,average);
            }
      }
        }

        System.out.println(averageStudentGrades);
    }
}
