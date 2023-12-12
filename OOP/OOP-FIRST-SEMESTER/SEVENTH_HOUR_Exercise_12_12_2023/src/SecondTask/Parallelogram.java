package SecondTask;

public class Parallelogram extends Figure{
    private double height;
    public Parallelogram(double sideA, double sideB, double height) {
        super(sideA, sideB);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        double result = getSideA()*height;
        return result;
    }

    @Override
    public double round() {
        double result = 2*getSideA()+2*getSideB();
        return result;
    }
}
