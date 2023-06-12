package firstTerm;

public class fibonachi {
    public static void main(String[] args) {
        int n = 10; // the number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int result = 0;
            int p1 = 0;
            int p2 = 1;

            for (int i = 2; i <= n; i++) {
                result = p1 + p2;
                p1 = p2;
                p2 = result;
            }

            return result;
        }
    }
}
