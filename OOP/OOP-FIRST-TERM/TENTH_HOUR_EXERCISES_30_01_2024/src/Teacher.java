public class Teacher extends Person{
    private String position;

    public Teacher(String name, String phoneNumber, String position) {
        super(name, phoneNumber);
        this.position = position;
    }

    public Teacher(String name, String phoneNumber) {
        super(name, phoneNumber);
        this.position = "ASSISTANT";
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "position='" + position + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
