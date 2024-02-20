public class Hovercraft extends Vehicle implements isLandVehicle, IsSeaVessel{
    private int numberOfPassengers;

    public Hovercraft(double maxspeed, String model, double price) {
        super(maxspeed, model, price);
    }


    @Override
    public double checkPromo() {
        double price = getPrice();
         price = price*0.93;
         return price;
    }

    @Override
    public void enterSea() {
        System.out.println("Water");
    }

    @Override
    public void enterLand() {
        System.out.println("Land");
    }
}
