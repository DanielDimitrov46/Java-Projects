import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        HashMap<String, Integer> count = new HashMap<>(16);
        for (int i = 0; i < words.length; i++) {
            String currentOccurence = words[i];
            if(count.containsKey(currentOccurence)) {
                int value = count.get(currentOccurence);
                count.replace(currentOccurence,value+1);
            }else{
                count.put(currentOccurence,1);
            }
        }
        System.out.println(count.toString());
    }
}
