package Ex3;

abstract class Room {
    private int roomnumber;
    private int studentCapacity;

    public Room(int roomnumber, int studentCapacity) {
        this.roomnumber = roomnumber;
        this.studentCapacity = studentCapacity;
    }
}
