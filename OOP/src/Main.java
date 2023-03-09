import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h = scanner.nextInt();
        if (a!=h){
            System.out.println("Romb");
        }else{
            System.out.println("Square");
        }
    }
}