import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         HashMap<String, String> catalog = new HashMap<>(12);

        catalog.put("Money For Nothing", "Dire Straits");
        catalog.put("Brothers In Arms", "Dire Straits");
        catalog.put("Your Latest Trick", "Dire Straits");
        catalog.put("Walk Of Life", "Dire Straits");
        catalog.put("Why Worry", "Dire Straits");
        catalog.put("Urgent", "Foreigner");
        catalog.put("Snowman", "Foreigner");
        catalog.put("I Want To Know", "Foreigner");
        catalog.put("The Wall", "Pink Floyd");
        catalog.put("Shine On You Crazy Diamond", "Pink Floyd");
        catalog.put("Wish You Were Here", "Pink Floyd");
        catalog.put("Time", "Pink Floyd");

        System.out.println("Моля, изберете опция:");
        System.out.println("1. Търсене по група");
        System.out.println("2. Търсене по песен");
        int option = Integer.parseInt(reader.readLine());

        switch (option) {
            case 1:
                System.out.print("Въведете име на група: ");
                String group = reader.readLine();

                System.out.println("Песни от групата " + group + ":");
                for (Map.Entry<String, String> entry : catalog.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(group)) {
                        System.out.println(entry.getKey());
                    }
                }
                break;

            case 2:
                System.out.print("Въведете име на песен: ");
                String song = reader.readLine();

                if (catalog.containsKey(song)) {
                    group = catalog.get(song);
                    System.out.println("Песента '" + song + "' е на групата " + group);
                } else {
                    System.out.println("Песента '" + song + "' не е намерена в каталога");
                }
                break;

            default:
                System.out.println("Невалидна опция");
                break;
        }
    }
}