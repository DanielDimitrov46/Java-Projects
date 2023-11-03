import java.util.Scanner;

public class BarStar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beers = 200;
        int wine = 300;
        int deliveriesCounterBeer = 0;
        int ordersCounterBeer = 0;
        int deliveriesCounterWine = 0;
        int ordersCounterWine = 0;
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String text = command.split(": ")[0];
            int quantity = Integer.parseInt(command.split(" ")[1]);
            if (text.equals("Beers")){
                if (quantity > 0) {
                    beers+=quantity;
                    deliveriesCounterBeer++;
                }else{
                    beers+=quantity;
                    ordersCounterBeer++;
                }
            }else if (text.equals("Wines")){
                if (quantity > 0) {
                    wine+=quantity;
                    deliveriesCounterWine++;
                }else{
                    wine+=quantity;
                    ordersCounterWine++;while (!command.equals("END")) {
            String text = command.split(": ")[0];
            int quantity = Integer.parseInt(command.split(" ")[1]);
            if (text.equals("Beers")){
                if (quantity > 0) {
                    beers+=quantity;
                    deliveriesCounterBeer++;
                }else{
                    beers+=quantity;
                    ordersCounterBeer++;
                }
            }else if (text.equals("Wines")){
                if (quantity > 0) {
                    wine+=quantity;
                    deliveriesCounterWine++;
                }else{
                    wine+=quantity;
                    ordersCounterWine++;
                }
            }else {
                System.out.println("Unknown");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Wines: %d\n",wine);
        System.out.printf("Deliveries: %d\n",deliveriesCounterWine);
        System.out.printf("Orders: %d\n",ordersCounterWine);
        System.out.printf("Beers: %d\n",beers);
        System.out.printf("Deliveries: %d\n",deliveriesCounterBeer);
        System.out.printf("Orders: %d\n",ordersCounterBeer);
    }
}
