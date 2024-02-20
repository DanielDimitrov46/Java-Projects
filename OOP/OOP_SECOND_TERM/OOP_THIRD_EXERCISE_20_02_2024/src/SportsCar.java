public class SportsCar extends Vehicle{
    private int horsepower;
    private double acc;

    public SportsCar(String brand, int numberOfPassengers, int horsepower, double acc ) throws InvalidCarParametersException {
        super(brand, numberOfPassengers);
        setHorsepower(horsepower);
        this.acc = acc;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) throws InvalidCarParametersException {
            if (horsepower>1){
                this.horsepower = horsepower;
            }else{
                throw new InvalidCarParametersException("Horsepower must be above zero");
            }
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    @Override
    public void accelaration() {
        System.out.println("Car is accelarating with " + this.acc);
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "horsepower=" + horsepower +
                ", acc=" + acc +
                '}';
    }
}
