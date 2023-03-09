package Exercises.secondTerm.Exercise.Week1OOP;

public class MyMath {
    public static int MathABS(int number) {
        if (number < 0) {
            number = number * -1;
        } else {
            number = number;
        }
        return number;
    }
    public static int MathMIN(int a, int b) {
        if (a <b){
            return a;
        }else{
            return b;
        }
    }
    public static int MathMAX(int a, int b) {
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}
