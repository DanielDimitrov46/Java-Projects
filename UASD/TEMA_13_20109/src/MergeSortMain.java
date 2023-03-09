import java.io.IOException;

public class MergeSortMain {
    public static void main(String[] args) throws IOException {
        MergeSortMethods.input();
        System.out.println("Before sorting array:");
        MergeSortMethods.print();
        MergeSortMethods.Mergesort(MergeSortMethods.myArray,0,MergeSortMethods.myArray.length-1);
        System.out.println("Sorted array:");
        MergeSortMethods.print();
    }
}
