package SecondTask;

public class Rectangle extends Figure{
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }
    @Override
    public double area(){
        double result = getSideA() * getSideB();
        return result;
    }
    @Override
    public double round(){
        double result = 2*getSideA() + 2*getSideB();
        return result;
    }
}
