package bubbleSortHomework;

import java.io.IOException;
import java.util.Arrays;

import static bubbleSortHomework.Util_HW.*;

public class App_HW {
    public static void main(String[] args) throws IOException {
        Util_HW.input();
        Util_HW.separateOddAndEven();
        Util_HW.print();
        Util_HW.sortAscending();
        Util_HW.sortDescending();
        System.out.println();
        System.out.println("СЛЕД СОРТИРАНЕ :: ");
        System.out.println("myArray : " + Arrays.toString(myArray));
        System.out.println("myEven : " + Arrays.toString(myEven));
        System.out.println("myOdd : " + Arrays.toString(myOdd));
    }
}

