public class CalculatorUtil {
    static double result;

    public static void plus(double x, double y) {
        result = x + y;
        System.out.printf("%.0f + %.0f = %.0f",x,y,result);
    }

    public static void minus(double x, double y) {
        result = x - y;
        System.out.printf("%.0f - %.0f = %.0f",x,y,result);
    }

    public static void divide(double x, double y) {
        result = x / y;
        System.out.printf("%.0f / %.0f = %.0f",x,y,result);
    }

    public static void power(double x, double y) {
        result = x * y;
        System.out.printf("%.0f * %.0f = %.0f",x,y,result);
    }
}
