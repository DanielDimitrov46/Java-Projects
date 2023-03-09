package bubbleSortHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Util_HW {
    public static int[] myArray;
    static int[] myEven;    // четни, само дефиниран без инициализиран
    static int[] myOdd;     // не-четни, само дефиниран без инициализиран
    static int   countEven = 0;
    static int   countOdd  = 0;
    public static void input() throws IOException {
        System.out.print("Input number of elements: ");

        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(myReader.readLine());
        myArray = new Random().ints(n, 1, 100).toArray();

    }

    public static void separateOddAndEven() {
        for (int temp_int : myArray)
        {

            if (temp_int % 2 == 0) // ако е четен
            {
                countEven++;
            }
            else                    // ако не е четен
            {
                countOdd++;
            }

        }

        myEven = new int[countEven];    // инициализирам четния масив
        myOdd  = new int[countOdd];     // инициализирам нечетния масив


        // разделяне
        int count_all  = 0;
        int count_even = 0;
        int count_odd  = 0;

        while (count_all < myArray.length)
        {

            if (myArray[count_all] % 2 == 0) // ако е четен
            {
                myEven[count_even] = myArray[count_all];
                count_even++;
            }
            else                            // ако е нечетен
            {
                myOdd[count_odd] = myArray[count_all];
                count_odd++;
            }

            count_all++;

        }

    }

    public static void print() {
        System.out.println("myArray : " + Arrays.toString(myArray));
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));
    }

    public static void sortAscending() {
        boolean swapped = false;
        int n = myEven.length-1;
        do {
            n--;
            swapped = false;
            for (int i = 0; i <= n; i++) {
                if (myEven[i]> myEven[i+1]){
                    int temp = myEven[i];
                    myEven[i] = myEven[i+1];
                    myEven[i+1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }

    public static void sortDescending() {
        for (int i = 0; i < myOdd.length-1; i++) {
            for (int j = 0; j < myOdd.length-i-1; j++) {
                if (myOdd[j] < myOdd[j+1]) {
                    int temp = myOdd[j];
                    myOdd[j] = myOdd[j+1];
                    myOdd[j+1] = temp;

                }
            }
        }
    }
}
