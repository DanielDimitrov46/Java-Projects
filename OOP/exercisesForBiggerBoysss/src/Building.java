public class Building {
    private int height;
    private float floor;
    private  String address;

    public Building(int height, float floor, String address) {
        this.setHeight(height);
        this.setFloor(floor);
        this.setAddress(address);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getFloor() {
        return floor;
    }

    public void setFloor(float floor) {
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "height=" + height +
                ", floor=" + floor +
                ", address='" + address + '\'' +
                '}';
    }

    class House extends Building {
        private int floors;
        private String nameOfOwner;
        private String phoneNUmber;

        public House(int height, float floor, String address) {
            super(height, floor, address);
        }
    }
}
