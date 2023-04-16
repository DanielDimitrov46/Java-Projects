import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Linked {


    public static void addElement(int number, LinkedList integers) {
        integers.add(number);
    }
    public static void removeElement(int number, LinkedList integers){
        integers.remove(integers.indexOf(number));
    }public static void addElementWithIndex(int number, int index, LinkedList integers){
        integers.add(index,number);
    }public static void removeElementWithIndex(int index, LinkedList integers){
        integers.remove(index);
    }public static void addFirstElement(int number, LinkedList integers){
        integers.addFirst(number);
    }public static void addLastElement(int number, LinkedList integers){
        integers.addLast(number);
    }public static void removeFirstElement( LinkedList integers){
        integers.removeFirst();
    }public static void removeLastElement( LinkedList integers){
        integers.removeLast();
    }//malko sa izlizshni tezi 4ri metoda no nishto :)

    public static void main(String[] args) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello welcome to Linked List machine!");
        System.out.println("--------------------------------");
        System.out.println("1.Add element to list!");
        System.out.println("2.Remove element from list!");
        System.out.println("3.Add element with index to list!");
        System.out.println("4.Remove element with index to list!");
        System.out.println("5.Add element first position!");
        System.out.println("6.Add element last position!");
        System.out.println("7.Remove element first position!");
        System.out.println("8.Remove element last position!");
        System.out.println("9.Print linked list");
        System.out.println("10.Exit from program!");
        System.out.println("---------------------------------");

        LinkedList<Integer> integers = new LinkedList<>();
        System.out.print("Enter a choice:");
        int choice = Integer.parseInt(myReader.readLine());
        do{
            switch (choice) {
                case 1->{
                    System.out.println("Enter your number to store:");
                    int number = Integer.parseInt(myReader.readLine());
                    addElement(number,integers);
                }
                case 2->{
                    System.out.println("Enter your number to remove:");
                    int number = Integer.parseInt(myReader.readLine());
                    removeElement(number,integers);
                }
                case 3->{
                    System.out.println("Enter your number and index you want to ADD:");
                    int number = Integer.parseInt(myReader.readLine());
                    int index = Integer.parseInt(myReader.readLine());
                    addElementWithIndex(number,index,integers);
                }
                case 4->{
                    System.out.println("Enter number index you want to REMOVE:");
                    int index = Integer.parseInt(myReader.readLine());
                    removeElementWithIndex(index,integers);
                }case 5->{
                    System.out.println("Enter number you want to add first position:");
                    int number = Integer.parseInt(myReader.readLine());
                    addFirstElement(number,integers);

                }case 6->{
                    System.out.println("Enter number you want to add last position:");
                    int number = Integer.parseInt(myReader.readLine());
                    addLastElement(number,integers);

                }case 7->{
                    System.out.println("Remove number first position:");
                    removeFirstElement(integers);
                }case 8->{
                    System.out.println("Remove number last position:");
                    removeLastElement(integers);
                }case 9->{
                    System.out.println(integers);
                }case 10->{
                    return;
                }
            }
            System.out.print("Enter a choice:");
            choice = Integer.parseInt(myReader.readLine());
        }while (choice != 10);
        System.out.println("Goodbye");
    }
}