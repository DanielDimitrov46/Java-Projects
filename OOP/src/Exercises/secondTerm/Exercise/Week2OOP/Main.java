package Exercises.secondTerm.Exercise.Week2OOP;

import Exercises.secondTerm.Exercise.Week1OOP.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(3000,4,"Nissan");
        System.out.println(engine1);
        Car car1 = new Car(1500,"Logan",new Engine(1500,4,"Dacia"),"Dacia");
        System.out.println(car1);

        Person owner1 = new Person();
        ArrayList<Car> myCars = new ArrayList<>();
        Car bmw = new Car(2004,"e46", new Engine(1998,4,"BMW"),"BMW");
        Car nissan = new Car();
        myCars.add(bmw);
        myCars.add(nissan);
        myCars.add(nissan);

        CarDealership myDealership1 = new CarDealership(owner1, myCars);
        System.out.println(myDealership1);
        myDealership1.removeCar(nissan);
        myDealership1.removeCar(nissan);
        System.out.println(myDealership1);
    }
}
