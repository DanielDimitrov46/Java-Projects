package Ex3;

public class Principle extends Worker{
    int numberOfStudentsYelledAt = 0;

    public Principle(int workerId, String name) {
        super(workerId, name);
    }

    public void greeting(Worker name){
        System.out.println("Dont run in the hallways, "+ getName());

    }

}
