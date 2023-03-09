package Exercises.firstTerm.classwork.Week5;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5_christmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("lego",0);
        map.put("monopoly",0);
        map.put("puzzle",0);
        map.put("robot",0);
        int numberOfKids = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfKids; i++) {
            String currentGift = scanner.nextLine();
            map.put(currentGift,map.get(currentGift)+1);
        }
        for (String currentGift : map.keySet()) {
//            System.out.println("Current gift: "+currentGift+" and number of current gifts are: "+map.get(currentGift));
            System.out.println(currentGift+":"+map.get(currentGift));
        }
    }
}
