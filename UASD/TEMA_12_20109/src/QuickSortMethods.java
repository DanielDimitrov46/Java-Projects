import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class QuickSortMethods {
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

    public static void swap(int[] myArray, int i, int j) {
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    static int partition(int[] myArray, int low, int high) {
        int pivot = myArray[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (myArray[j] < pivot) {
                i++;
                swap(myArray, i, j);
            }
        }
        swap(myArray, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] myArray, int low, int high) {
        if (low < high) {
            int pi = partition(myArray,low,high);

            quickSort(myArray, low, pi-1);
            quickSort(myArray, pi+1, high);
        }
    }
}
