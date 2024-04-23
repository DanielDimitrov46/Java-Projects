public class House extends Building {
    private int numberOfFloors;
    private String nameOfOwner;

    public House(int height, double area, String address, int numberOfFloors, String nameOfOwner) {
        super(height, area, address);
        this.numberOfFloors = numberOfFloors;
        this.nameOfOwner = nameOfOwner;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) throws invalidNameException {
        if (nameOfOwner == null) {
            throw new invalidNameException("Cannot be empty!");
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
