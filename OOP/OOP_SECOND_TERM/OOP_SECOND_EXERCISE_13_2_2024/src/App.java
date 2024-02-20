public class App {
    public static void main(String[] args) {
        try {
            Car car = new Car(280, "e46", 20000, 143);
            Hovercraft hovercraft = new Hovercraft(200, "ne znam", 200);
            Ship ship = new Ship(20, "titanic", 200000);
            car.enterLand();
            hovercraft.enterLand();
            ship.enterSea();
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }
    }
}