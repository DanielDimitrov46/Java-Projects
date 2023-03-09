package Exercises.secondTerm.Exercise.Week1;

public class Exercises {
    public static void AND() {
        System.out.println(10 & 8);
    }

    public static void OR() {
        System.out.println(7 | 9);
    }

    public static void XOR() {
        System.out.println(6 ^ 4);
    }

    public static void Complement() {
        System.out.println(~2);
    }

    public static void leftShift() {
        System.out.println(5 >> 2);
    }

    public static void rightShift() {
        System.out.println(5 << 2);
    }

    public static int lowestBit(int num) {
        return num & 1;
    }

    public static int highestBit(int num) {
        return (num >> 31) & 1;
    }
    public static int nthBit(int num, int n) {
        return (num >> (n-1)) & 1;
    }
    public static void checkParity(int num) {
     int lowest = lowestBit(num);
     if (lowest==0){
         System.out.println("Even");
     }else{
         System.out.println("Odd");
     }
    }

    public static void main(String[] args) {
        AND();
        OR();
        XOR();
        Complement();
        leftShift();
        rightShift();
        System.out.println(lowestBit(4));
        System.out.println(highestBit(23));
        System.out.println(nthBit(5,3));
        checkParity(10);
    }

}
