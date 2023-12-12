package SecondTask;

public class Square extends Figure{
    private double height;

    public Square(double sideA, double sideB, double height) {
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
    public double area (){
        double result = getSideA()*getSideB();
        return result;
    }
    @Override
    public double round(){
        double result = (getSideA()*4);
        return result;
    }
}
