import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
        if (first>0&&second>0&&third>0||first>0&&second<0&&third<0||first<0&&second>0&&third<0||first<0&&second<0&&third>0) {
            System.out.println("+");
        }else if (first==0||second==0||third==0) {
            System.out.println("0");
        }else{
            System.out.println("-");
        }
    }
}
