package Tomov.Car;

public class Car {
    String[] carArray;
    String brand,color;
    boolean avtomatic;
    public Car (String brand,String color, boolean avtomatic){
        this.brand = brand;
        this.color = color;
        this.avtomatic = avtomatic;
    }

    public Car[] getBrandCars(Car[] cars, String brand) {
        Car [] brandCars = new Car[cars.length];
        int numberOfCars = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(brand)){
                brandCars[numberOfCars] = cars[i];
                numberOfCars++;
            }
        }
        return brandCars;
    }
}

