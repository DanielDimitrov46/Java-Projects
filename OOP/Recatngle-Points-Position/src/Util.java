public class Util {
 public static void main(String[] args) {
        int x1 = 0, y1 = 0;
        int x2 = 3, y2 = 0;
        int x3 = 0, y3 = 4;
        int x0 = 2, y0 = 3;

        // Проверяваме дали триъгълникът е правоъгълен
        boolean isRightTriangle = isRightTriangle(x1, y1, x2, y2, x3, y3);

        if (isRightTriangle) {
            // Намираме наклона и свободния член на хипотенузата
            double m = (double) (y3 - y1) / (x3 - x1);
            double b = y1 - m * x1;

            // Проверяваме дали точката (x0, y0) лежи на хипотенузата
            boolean isOnHypotenuse = (y0 == m * x0 + b);

            if (isOnHypotenuse) {
                System.out.println("Точката лежи на хипотенузата.");
            } else {
                System.out.println("Точката не лежи на хипотенузата.");
            }
        } else {
            System.out.println("Триъгълникът не е правоъгълен.");
        }
    }

    public static boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int side1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        int side2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
        int hypotenuse = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);

        return (side1 == side2 + hypotenuse) || (side2 == side1 + hypotenuse) || (hypotenuse == side1 + side2);
    }
}
