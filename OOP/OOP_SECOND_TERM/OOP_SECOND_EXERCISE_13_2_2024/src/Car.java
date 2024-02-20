public class Car extends Vehicle implements isLandVehicle{
    private int power;

    public Car(double maxspeed, String model, double price, int power) {
        super(maxspeed, model, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double checkPromo() {
         double price = getPrice();
         price = price*0.80;
         return price;
    }

    @Override
    public void enterLand() {
        System.out.println("Land");
    }
}
