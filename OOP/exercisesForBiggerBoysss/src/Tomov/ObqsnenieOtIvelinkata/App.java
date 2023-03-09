package Tomov.ObqsnenieOtIvelinkata;

public class App {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Golf",200,"VW","Red");
        cars[1] = new Car("Passat",500,"VW","Red");
        cars[2] = new Car("Golf",150,"VW","Black");
        cars[3] = new Car("Polo",50,"VW","Black");

        printArray(cars);
        System.out.println(getAverageHp(cars));
        System.out.println(getSumOnHp(cars));
        System.out.println(getPoweredCar(cars));
        System.out.println(getWeakCar(cars));
    }

    public static double getAverageHp(Car[] cars){
        return (double) getSumOnHp(cars) / (double) cars.length;
    }

    public static int getSumOnHp(Car[] cars){
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            Car currentCar = cars[i];
            sum += currentCar.getHp();
        }
        return sum;
    }

    public static Car getWeakCar(Car[] cars){
        int min = Integer.MAX_VALUE;
        Car car = new Car();
        for (int i = 0; i < cars.length; i++) {
            Car currentCar = cars[i];

            if(currentCar.getHp() < min){
                min = currentCar.getHp();

                car.setHp(currentCar.getHp());
                car.setBrand(currentCar.getBrand());
                car.setModel(currentCar.getModel());
                car.setColor(currentCar.getColor());
            }
        }
        return car;
    }

    public static Car getPoweredCar(Car[] cars){
        int max = Integer.MIN_VALUE;
        Car car = new Car();
        for (int i = 0; i < cars.length; i++) {
            Car currentCar = cars[i];

            if(currentCar.getHp() > max){
                max = currentCar.getHp();

                car.setHp(currentCar.getHp());
                car.setBrand(currentCar.getBrand());
                car.setModel(currentCar.getModel());
                car.setColor(currentCar.getColor());
            }
        }
        return car;
    }

    public static void printArray(Car[] array){
        System.out.println("-----------------------------------");
        for (int i = 0; i < array.length; i++) {
            Car currentCar = array[i];
            System.out.println(currentCar);
        }
        System.out.println("-----------------------------------");
    }
}
