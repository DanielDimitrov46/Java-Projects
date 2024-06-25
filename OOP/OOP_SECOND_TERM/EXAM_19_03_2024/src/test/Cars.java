package test;

public class Cars {

    Car[] cars = new Car[15];


    public void addCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != car) {
                if (cars[i] == null) {
                    cars[i] = car;
                }
            } else {
                System.out.println("Car exist");
                break;
            }

        }

    }

    public void printSearchFromParams(String brand) {
        if (brand.equals("")) {
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
        } else {
            for (int i = 0; i < cars.length; i++) {
                Car currentElement = cars[i];

                if (currentElement.getBrand().equals(brand)) {
                    System.out.println(currentElement);

                }
            }
        }
    }


    public Car maxPrice() {
        Car maxCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            Car currentElement = cars[i];
            if (currentElement.getPrice() > maxCar.getPrice()) {
                maxCar = currentElement;
            }
        }
        return maxCar;
    }

    public double averagePrice(String brand) {
        double averagePrice = 0;
        double sumPrieOfCar = 0;

        if (brand.equals("")) {
            for (int i = 0; i < cars.length; i++) {
                Car currentElement = cars[i];
                sumPrieOfCar += currentElement.getPrice();
            }
            averagePrice = sumPrieOfCar / cars.length;


        } else {
            int counter = 0;
            for (int i = 0; i < cars.length; i++) {
                Car currentCar = cars[i];
                if (currentCar.getBrand().equals(brand)) {
                    counter++;
                    sumPrieOfCar += currentCar.getPrice();
                }

            }

            averagePrice = sumPrieOfCar / counter;

        }

        return averagePrice;

    }

}





