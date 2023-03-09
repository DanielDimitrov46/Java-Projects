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

    public static void selection_sort() {
        for (int i = 0; i < myArray.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[index]) {
                    index = j;
                }
            }
            int temp = myArray[index];
                myArray[index] = myArray[i];
                myArray[i] = temp;
        }
    }
}
