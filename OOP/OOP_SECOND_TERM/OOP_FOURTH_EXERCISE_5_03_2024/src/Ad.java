import java.util.ArrayList;
import java.util.List;

public class Ad {
    private static List<Car> carList;

    public Ad(List<Car> carList) {
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
    public static void adCar (Car car) throws ExistingCarException {
        if (carList.contains(car)){
            throw new ExistingCarException("Car already exists");
        }else{
        carList.add(car);
        }
    }

    public static void removeCar (Car car) throws ExistingCarException {
        if (carList.contains(car)){
            for (Car current:  carList) {
                if (current.getSerialNumber().equals(car.getSerialNumber())){
                    carList.remove(car);
                }
            }
        }else{
            throw new ExistingCarException("Car does not exist");
        }
    }

    public static void printCar (String brand, String model) throws ExistingCarException {
        if (brand.isEmpty() && model.isEmpty()){
            for (Car current: carList) {
                System.out.println(current);
            }
        }else{
            for (Car current: carList) {
                if(current.getBrand().equals(brand) || current.getModel().equals(model)){
                    System.out.println(current);
                }
            }
        }
    }
    public double highestCarPrice(){
        double highestPrice = carList.get(0).getPrice();
        for (Car current: carList) {
            if(current.getPrice()>highestPrice){
                highestPrice = current.getPrice();
            }
        }
        return highestPrice;
    }
}
