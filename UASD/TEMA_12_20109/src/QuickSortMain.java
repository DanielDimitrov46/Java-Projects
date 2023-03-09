import java.io.IOException;

public class QuickSortMain {
    public static void main(String[] args) throws IOException {
        QuickSortMethods.input();
        QuickSortMethods.print();
        QuickSortMethods.quickSort(QuickSortMethods.myArray,0, QuickSortMethods.myArray.length-1);
        System.out.println("Sorted array:");
        QuickSortMethods.print();
    }
}
