package zad;

public class App {

    public static void main(String[] args) {

        Cat[] cates = new Cat[5];

        cates[0] = new Cat("Daniel", 23, "black");
        cates[1] = new Cat("Daniel", 27, "black");
        cates[2] = new Cat("Daniel", 23, "black");
        cates[3] = new Cat("Daniel", 1, "black");
        cates[4] = new Cat("Daniel", 23, "black");

        System.out.println("Средната стойност от годините:" + avg(cates));
        System.out.println("НАЙ-ГЛЕМИТЕ ГОДИНИ:"+maxAge(cates));
        System.out.println("Най-малките години:"+minAge(cates));


    }

    public static int maxAge(Cat[] cates) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < cates.length; i++) {
            Cat currentelement = cates[i];
            int age = currentelement.getAge();
            if (max < age) {
                max = age;
            }


        }
        return max;


    }

    public static int minAge(Cat[] cates) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < cates.length; i++) {
            Cat currentelement = cates[i];
            int age = currentelement.getAge();
            if (min > age) {
                min = age;
            }


        }
        return min;


    }

    public static double avg(Cat[] cates) {
        int ageAverage = 0;
        int sum = 0;
        for (int i = 0; i < cates.length; i++) {
            Cat currentelement = cates[i];
            int age = currentelement.getAge();
            sum += age;
            ageAverage = sum / cates.length;


        }
        return ageAverage;
    }
}


