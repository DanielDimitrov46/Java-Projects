public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Sandero","Dacia",10000,"2/2/2002","TE-1462");
        Car car2 = new Car();
        System.out.println(car1);
        Car[] allCars = new Car[10];
        Cars cars = new Cars(allCars);
        cars.addCar(car2);
        cars.search("BMW");
        System.out.println(cars.mostExpensive());
        System.out.println(Cars.averagePrice("BMW"));
    }

}
