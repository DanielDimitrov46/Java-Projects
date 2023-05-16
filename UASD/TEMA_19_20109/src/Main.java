import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] inputToChar = input.toCharArray();
        int[] indexes = new int[6];
        int length = inputToChar.length;
        int hashCode = 0;
        int asciiCode = 0;
        int power = 0;
        int idx = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Current element is:"+inputToChar[i]);
            asciiCode = (int)inputToChar[i];
            power = length-(i+1);
            int coefficient = (int) Math.pow(31, power);
            System.out.println("Ascii: "+ asciiCode +" * koef :"+coefficient+" = "+asciiCode*coefficient);
            hashCode +=(asciiCode*coefficient);

        }
            idx = hashCode%10;
        System.out.println("Index of element is:"+idx);
        indexes[idx]=hashCode;
    }
}