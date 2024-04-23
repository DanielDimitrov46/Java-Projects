public class invalidNameException extends Exception {
    private String message;

    public invalidNameException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
