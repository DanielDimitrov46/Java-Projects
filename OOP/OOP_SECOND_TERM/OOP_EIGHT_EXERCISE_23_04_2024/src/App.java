import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<House>();
        Apartments apartment1 = new Apartments(3);
        Apartments apartment2 = new Apartments(4);
        Apartments[] apartments = new Apartments[2];
        apartments[0] = apartment1;
        apartments[1] = apartment2;
        Block block = new Block(130,1200,"ul.TOshovo",4,apartments);
        try {
            houses.add(insert());
            read(houses);
            biggestHouse(houses);
        } catch (invalidNameException e) {
            System.out.println(e.getMessage());
        }
    }

    public static House insert() throws invalidNameException {
        Scanner scanner = new Scanner(System.in);
        House house = new House(Integer.parseInt(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine());
        return house;
    }

    public static void read(ArrayList<House> houses){
        for (House house: houses){
            System.out.println(house);
        }
    }
    public static void biggestHouse(ArrayList<House> houses){
        House max = houses.get(0);
        for (House house: houses){
            if (max.getArea()< house.getArea()){
                max = house;
            }
        }
        System.out.println("Biggest house"+ max);
    }
}