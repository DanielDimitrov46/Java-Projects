import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1PravetsCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allLessons = scanner.nextLine();
        ArrayList<String> lessons = new ArrayList<String>();

        String[] lessons1 = (allLessons.split(" -> "));
        for (String currentLesson : lessons1) {
            lessons.add(currentLesson);
        }
        String command = scanner.nextLine();
        while (!command.equals("start academy")) {
            String[] allCommands = command.split(":");
            String operation = allCommands[0];
            String value = allCommands[1];
            if (operation.equals("Add") && !lessons.contains(value)) {
                lessons.add(value);
            } else if (operation.equals("Insert") && !lessons.contains(value)) {
                int indexToAdd = Integer.parseInt(allCommands[2]);
                lessons.add(indexToAdd, value);
            } else if (operation.equals("Remove") && lessons.contains(value)) {
                lessons.remove(value);
            } else if (operation.equals("Swap") && lessons.contains(value)) {
                String valueToSwap = allCommands[2];
                Collections.swap(lessons, lessons.indexOf(value), lessons.indexOf(valueToSwap));
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, lessons.get(i));
        }

    }
}
