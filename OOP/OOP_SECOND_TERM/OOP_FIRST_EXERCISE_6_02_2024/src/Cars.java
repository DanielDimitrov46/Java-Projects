import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
    private static Car[] carArray = new Car[15];

    public Cars(Car[] carArray) {
        this.carArray = carArray;
    }

    public Car[] getCarArray() {
        return carArray;
    }

    public void setCarArray(Car[] carArray) {
        this.carArray = carArray;
    }

    public void addCar(Car current) {
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i] != null) {
                Car curr = carArray[i];
                if (curr.getId().equals(current.getId())) {
                    System.out.println(curr);
                    System.out.println("This picture already exists!");
                }
            } else {
                carArray[i] = current;
                break;
            }
        }
    }

    public void search(String brand) {
        if (brand.isEmpty()) {
            for (Car curr : carArray) {
                System.out.println(curr);
            }
        } else {
            for (int i = 0; i < carArray.length; i++) {
                if (carArray[i] != null) {
                    Car curr = carArray[i];
                    if (curr.getBrand().equals(brand)) {
                        System.out.println(curr);
                    }
                    break;
                }
            }

        }
    }
    public ArrayList<Car> mostExpensive() {
        ArrayList<Car> mostExpensive = new ArrayList<>();
        Car max = carArray[0];
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i] != null) {
                Car curr = carArray[i];
                if (curr.getPrice() > max.getPrice()) {
                    max = curr;
                }
            }
        }
        mostExpensive.add(max);
        return mostExpensive;
    }

    public static double averagePrice(String brand) {
        double sum = 0;
        int counterForMatch = 0;
        if (brand.isEmpty()) {
            for (Car curr : carArray) {
                sum += curr.getPrice();
            }
            sum = sum / carArray.length;
        } else {
            for (int i = 0; i < carArray.length; i++) {
            if (carArray[i] != null) {
                Car curr = carArray[i];
                if (curr.getBrand().equals(brand)) {
                    sum += curr.getPrice();
                    counterForMatch++;
                }
            }
        }
            sum = sum / counterForMatch;
        }
        return sum;

    }
}
