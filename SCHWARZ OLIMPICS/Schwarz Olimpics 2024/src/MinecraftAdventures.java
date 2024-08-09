import java.util.ArrayList;
import java.util.Scanner;

public class MinecraftAdventures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int cobblestone = 0;
        int wood = 0;
        int stick = 0;
        int pickaxeCounter = 0;
        while (!command.equals("END")) {
            if (command.equals("Cobblestone")) {
                cobblestone += 1;
            } else if (command.equals("Wood")) {
                wood += 1;
            } else if (command.equals("Sticks")) {
                stick += 1;
            } else {
                System.out.println("Unknown command");
            }
            command = scanner.nextLine();
        }
        do {
            if (cobblestone >= 3) {
                if (stick >= 1) {
                    pickaxeCounter += 1;
                    cobblestone -= 3;
                } else if (wood >= 1) {
                    stick += 4;
                    wood -= 1;
                    pickaxeCounter += 1;
                    cobblestone -= 3;
                }
            }
        } while (cobblestone >= 3 && (wood >= 1 || stick >= 1));
        System.out.printf("Amount of stone pickaxes: %d", pickaxeCounter);

    }
}