import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Buyable> allProducts = new ArrayList<>();
//        Buyable[] buyableArray = new Buyable[2];
//        buyableArray[0] = new Product(234,"Bate pesho",3);
//        buyableArray[1] = new BetterProduct(234,"Bate gosho",3);
//        for (int i = 0; i < buyableArray.length; i++) {
//            Buyable buyable = buyableArray[i];
//            System.out.println(buyable.getName());
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our app!");
        String input = scanner.nextLine();
        int choice = 0;
        while (input.equals("Exit")) {
            choice = Integer.parseInt(input);
            System.out.println("What do you want to do?");
            System.out.println("1. Enter data for new product");
            System.out.println("2. Search product by name?");
            System.out.println("Choose your option with number!");
            if(choice==1){
                addNewProduct(allProducts,scanner);
            }else{
                Buyable product = searchProduct(scanner.nextLine(), allProducts);
                if (product == null){
                    System.out.println("NOthing found");
                }else{
                    System.out.println(product);
                }
            }
            input = scanner.nextLine();
        }
    }

    public static void addNewProduct(ArrayList<Buyable> products, Scanner scanner) {
        Buyable current = new Product(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        products.add(current);
    }

    public static Buyable searchProduct(String name, ArrayList<Buyable> products){
        Buyable productReturn = null;
        for (Buyable product : products){
            if (product.getName().equals(name)){
                productReturn =  product;
            }
        }
        return productReturn;
    }
}