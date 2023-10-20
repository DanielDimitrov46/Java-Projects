import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        double[] xPoints = {Integer.parseInt(myReader.readLine()), Integer.parseInt(myReader.readLine()), Integer.parseInt(myReader.readLine()),Integer.parseInt(myReader.readLine())};
        double[] yPoints = {Integer.parseInt(myReader.readLine()),Integer.parseInt(myReader.readLine()), Integer.parseInt(myReader.readLine()), Integer.parseInt(myReader.readLine())};
        double x0 = Double.parseDouble(myReader.readLine());
        double y0 = Double.parseDouble(myReader.readLine());

        if (xPoints[3] == xPoints[0] && xPoints[2] == xPoints[1] || yPoints[0] == yPoints[1] && yPoints[2] == yPoints[3]) {
            System.out.println("We have rectangle!");

            if (checkPointOnDiagonal(xPoints, yPoints, x0, y0)) {
                System.out.println("The point is on a diagonal.");
            } else {
                System.out.println("The point is not on a diagonal.");
            }
        } else {
            System.out.println("It's something else!");
        }
    }

    public static boolean checkPointOnDiagonal(double[] xPoints, double[] yPoints, double x0, double y0) {
        //y=mx+b
        double m = (yPoints[2]-yPoints[0])/(xPoints[2]-xPoints[0]);
        double b = yPoints[0]-m*xPoints[0];
        double y = m*x0+b;
        if(y==y0){
            return true;
        }else{
            return false;
        }
    }

}