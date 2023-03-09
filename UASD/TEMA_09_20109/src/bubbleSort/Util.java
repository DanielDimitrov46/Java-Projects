package bubbleSort;

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

    public static void BS_sort_FF() {
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = 0; j < myArray.length-i-1; j++) {
                if (myArray[j] > myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;

                }
            }
        }
    }

    public static void BS_sort_DW() {
        boolean swapped = false;
        int n = myArray.length-1;
        do {
            n--;
            swapped = false;
            for (int i = 0; i <= n; i++) {
                if (myArray[i]> myArray[i+1]){
                    int temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }

}
