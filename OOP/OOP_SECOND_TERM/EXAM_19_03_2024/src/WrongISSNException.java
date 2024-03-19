public class WrongISSNException extends Exception{
    private String message;

    public WrongISSNException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
