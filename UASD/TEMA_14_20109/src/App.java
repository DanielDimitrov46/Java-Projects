import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        System.out.println("Начало преди добавяне на елемнти:" + cars);
        System.out.println("Zad 1");
        System.out.println("Добавяне на елемент");
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("Suzuki");
        cars.add("Dacia");
        System.out.println("След добавяне на елемтите:" + cars);
        System.out.println("--------------------------------");

        System.out.println("Zad 2");
        System.out.println("Достъп до елемент:");
        System.out.println(cars.get(0));
        System.out.println(cars.get(3));
        System.out.println("--------------------------------");

        System.out.println("Zad 3");
        System.out.println("Преди смяна:");
        System.out.println(cars);
        System.out.println("След смяна:");
        cars.set(2, "Fiat");
        System.out.println(cars);
        System.out.println("--------------------------------");

        System.out.println("Zad 4");
        System.out.println("Преди премахване:" + cars);
        cars.remove(1);
        System.out.println("След премахване:" + cars);
        System.out.println("--------------------------------");

        System.out.println("Zad 5");
        System.out.println("For cycle");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("For-each");
        for (String currentCar : cars) {
            System.out.println(currentCar);
        }
        System.out.println("--------------------------------");
    }
}