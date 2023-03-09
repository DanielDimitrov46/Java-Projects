package coffeeMachineSoftware;

public class Machine {
    private double productPrice;
    private String product;
    static double quantityCoffeeInMachine = 3.0;
    public static double price;

    public Machine() {

    }

    public Machine(String product, double productPrice) {
        this.setProduct(product);
        this.setProductPrice(productPrice);
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public static void buy(String name) {
        if (name.equals("Espresso")) {
            if (quantityCoffeeInMachine >= 0.1) {
                quantityCoffeeInMachine -= 0.1;
                price = 1.80;
            } else {
                System.out.println("Not enough coffee in machine");
            }
        } else if (name.equals("Cappuccino")) {
            if (quantityCoffeeInMachine >= 0.2) {
                quantityCoffeeInMachine -= 0.2;
                price = 2.00;
            } else {
                System.out.println("Not enough coffee in machine");
            }
        } else if (name.equals("Mokachino")) {
            if (quantityCoffeeInMachine >= 0.3) {
                quantityCoffeeInMachine -= 0.3;
            } else {
                System.out.println("Not enough coffee in machine");
            }
        } else if (name.equals("Normal coffee")) {
            if (quantityCoffeeInMachine >= 0.4) {
                quantityCoffeeInMachine -= 0.4;
            } else {
                System.out.println("Not enough coffee in machine");
            }
        }else{
            System.out.println("UNKNOWN COFFEE! Enter another one:");
        }
    }

    public static void refill() {
        System.out.println("Machine was refiled with 3.0 kg of coffee!");
        quantityCoffeeInMachine = 3.0;
    }

    public static void printCoffeeInMachine(double price) {
        System.out.println("Coffee in machine is: " + quantityCoffeeInMachine + "kg."+price);
    }


    @Override
    public String toString() {
        return "Coffee: " + getProduct() + "; Price of coffee: " + getProductPrice() + " lv.";
    }
}

// Сигнатура на метод
