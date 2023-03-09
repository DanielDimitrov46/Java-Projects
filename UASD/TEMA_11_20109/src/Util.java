import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Util {
    public static int[] myArray;

    public static void input() throws IOException {
        System.out.print("Input number of elements: ");

        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(myReader.readLine());
        myArray = new Random().ints(n, 1, 100).toArray();
    }

    public static void print() {
        System.out.println(Arrays.toString(myArray));
    }

    public static void insertion_sort() {
        int n = myArray.length;
        for (int i = 1; i < n; i++) {
            int key = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > key) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = key;
        }
    }
}
