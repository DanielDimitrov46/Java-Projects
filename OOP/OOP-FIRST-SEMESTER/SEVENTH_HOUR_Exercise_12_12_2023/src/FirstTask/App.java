package FirstTask;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Ivan", "123456789","Brain surgery");
        PoliceMan policeman1 = new PoliceMan("Gosho", "123456789",5);
        //FirstTask.Person person1 = new FirstTask.Person("Pesho", "123456789");
        Person[] persons = new Person[2];
        persons[0] = doctor1;
        persons[1] = policeman1;
        System.out.println(Arrays.toString(persons));
    }
}
