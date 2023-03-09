package coffeeMachineSoftware;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static coffeeMachineSoftware.Machine.price;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Coffee[] coffees = new Coffee[4];
        coffees[0] = new Coffee("Espresso", 1.80 );
        coffees[1] = new Coffee("Cappuccino", 2.00);
        coffees[2] = new Coffee("Mokachino", 2.25);
        coffees[3] = new Coffee("Normal coffee", 1.90);


        while (true) {
            System.out.print("Enter a command: Buy or Refill or Print List of Coffees or Print Coffee in machine or Exit: ");
            String command = bfr.readLine();
            command = command.toLowerCase();
            if (command.equals("buy")) {
                System.out.print("Enter coffee: ");
                String coffee = bfr.readLine();
                System.out.print("Do you want sugar (with, without): ");
                String sugar = bfr.readLine();
                Machine.buy(coffee);
            } else if (command.equals("refill")) {
                Machine.refill();

            } else if (command.equals("print list of coffees")) {
                printArray(coffees);
            } else if (command.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (command.equals("print coffee in machine") ) {
                Machine.printCoffeeInMachine(price);
            } else {
                System.out.print("UNKNOWN COMMAND! Enter another one:");
                command = bfr.readLine();
            }
        }

    }


    public static void printArray(Coffee[] array) {
        System.out.println("-----------------------------------");
        for (Coffee machine : array) {
            System.out.println(machine);
        }
        System.out.println("-----------------------------------");
    }

}

