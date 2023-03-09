package bubbleSort;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println(":: BUBBLE SORT ::");
        Util.input();
        System.out.println("BEFORE SORTING");
        Util.print();
//        Util_HW.BS_sort_FF();
        Util.BS_sort_DW();
        System.out.println("AFTER SORTING");
        Util.print();
    }
}
