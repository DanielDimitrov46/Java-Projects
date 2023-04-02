package Ex3;

public class PresentationRoom extends Room{
    public PresentationRoom(int roomnumber, int studentCapacity) {
        super(roomnumber, studentCapacity);
        if (roomnumber>10){
            studentCapacity = 50;
        }else{
            studentCapacity = 75;
        }
    }
}
