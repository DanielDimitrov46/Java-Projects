package FirstTask;

public class Doctor extends Person{
    private String specialty;

    public Doctor(String name, String egn, String specialty) {
        super(name, egn);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    @Override
    public void work(){
        System.out.println("Working");
    }

    @Override
    public String toString() {
        return "FirstTask.Doctor{" +
                "specialty='" + specialty + '\'' +
                '}';
    }
}
