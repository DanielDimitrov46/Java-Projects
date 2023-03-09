package Tomov.Kateto;

public class Cars {
    public String model;
    String color;
    int year;

    public Cars(String model, String color, int year) {
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public static Cars[] diffColor(Cars[] cars, String searchCol) {
        int index = 0;
        Cars[] others = new Cars[cars.length];

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(searchCol)) {
                others[index] = cars[i];
            }
        }
        return others;
    }

}
