package SecondTask;

public abstract class Figure {
    private double sideA;
    private double sideB;

    public Figure(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public abstract double area();
    public abstract double round();

    // triangle, quadrat, trapec, pravougulnik, usporednik, romb
}