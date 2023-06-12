package Exercises;

public class NumberSequence {
    public static void main(String[] args) {
        int n = 10; // номерът на желания член в редицата

        int a = 71; // първият член в редицата
        int interval = 1; // текущият интервал

        for (int i = 1; i < n; i++) {
            if (interval == 1) {
                if (i % 4 == 0) {
                    interval = 2; // сменяме интервала
                }
                a += 10; // увеличаваме с 10
            } else {
                if (i % 4 == 0) {
                    interval = 1; // сменяме интервала
                }
                a -= 7; // намаляваме с 7
            }

            System.out.print(a + " ");
        }
    }
}

