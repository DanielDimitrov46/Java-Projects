package FirstTask;

public class PoliceMan extends Person{
    private int numberOfArrest;

    public PoliceMan(String name, String egn ,int numberOfArrest){
        super(name, egn);
        this.numberOfArrest = numberOfArrest;
    }

    public int getNumberOfArrest() {
        return numberOfArrest;
    }

    public void setNumberOfArrest(int numberOfArrest) {
        this.numberOfArrest = numberOfArrest;
    }
    @Override
    public void work(){
        System.out.println("Arresting");
    }

    @Override
    public String toString() {
        return "FirstTask.PoliceMan{" +
                "numberOfArrest=" + numberOfArrest +
                '}';
    }
}
