import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            Car car1 = new Car("BMW", "e46", 24424, "2.2.2222", "Petrol", "gfdnjlkfgjk");
            Car car2 = new Car("", "e46", 0, "2.2.2222", "Petrol", "gfdnjlkfgjk");
            Car car3 = new Car("BMW", "e46", 24424, "2.2.2222", "Petrol", "gfdnjlkfgjk");
            Car car4 = new Car("Dacia", "e46", 24424, "2.2.2222", "Petrol", "gfdnjlkfgjk");
            ArrayList<Car> carList = new ArrayList<Car>();
            carList.add(car1);
            carList.add(car2);
            carList.add(car3);
            Ad ad = new Ad(carList);
            ad.highestCarPrice();
            Ad.printCar("BMW","e46");
            Ad.adCar(car4);
        }catch(InvalidCarParametersException e){
            System.out.println(e.getMessage());
        } catch (ExistingCarException e) {
            throw new RuntimeException(e);
        }

    }
}