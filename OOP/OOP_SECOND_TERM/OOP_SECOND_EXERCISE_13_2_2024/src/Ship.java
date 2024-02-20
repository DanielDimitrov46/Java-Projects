public class Ship extends Vehicle implements IsSeaVessel{
    private double deadWeight;

    public Ship(double maxspeed, String model, double price) throws PriceException {
        super(maxspeed, model, price);
    }

    @Override
    public double checkPromo() {
        double price = getPrice();
         price = price*0.97;
         return price;
    }

    @Override
    public void enterSea() {
        System.out.println("Ship is in the water");
    }
}
