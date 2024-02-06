package SecondTask;

public class Trapec extends Figure{
    private double height;
    private double sideC;

    public Trapec(double sideA, double sideB, double height, double sideC) {
        super(sideA, sideB);
        this.height = height;
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        double result = (getSideA()*getSideB())/2*height;
        return result;
    }
    @Override
    public double round() {
        double result = (getSideA()+getSideB())+2*getSideC();
        return result;
    }
}
