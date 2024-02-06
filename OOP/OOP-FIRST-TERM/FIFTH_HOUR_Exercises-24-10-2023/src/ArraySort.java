import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static int[] sortAndFilter(int[] array, int key) {
        Arrays.sort(array);
        int[] needed = new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<key){
                needed[j] = array[i];
                j++;
            }
        }
        return needed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] copy = Arrays.copyOfRange(array, 0, array.length);
        int key = scanner.nextInt();
        copy = sortAndFilter(array,key);
        System.out.println(Arrays.toString(copy));
    }

}