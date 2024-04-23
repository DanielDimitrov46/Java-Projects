public class Block extends Building{
    private int floors;
    private Apartments[] apartments;

    public Block(int height, double area, String address, int floors, Apartments[] apartments) {
        super(height, area, address);
        this.floors = floors;
        this.apartments = apartments;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Apartments[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartments[] apartments) {
        this.apartments = apartments;
    }
}
