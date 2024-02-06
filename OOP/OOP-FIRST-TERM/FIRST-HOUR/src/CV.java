import java.util.Scanner;

public class CV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cvarray = new String[5];
//        String[] cvarray = {"name","age","country","job","salary"};
        System.out.println("Lets create your CV");
        System.out.println("For this answer this questions");
        System.out.println("What's your name: ");
        String name = scanner.nextLine();
        System.out.println("How old you are?");
        String age = scanner.nextLine();
        System.out.println("Where you come from: ");
        String country = scanner.nextLine();
        System.out.println("What do you want to do?");
        String job = scanner.nextLine();
        System.out.println("What salary you want?");
        String salary = scanner.nextLine();

        cvarray[0] = name;
        cvarray[1] = age;
        cvarray[2] = country;
        cvarray[3] = job;
        cvarray[4] = salary;
        for (String s : cvarray) {
            System.out.println("This is your answer: " + s);
        }
    }
}