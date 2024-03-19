public class ExistingCarException extends Exception {
    private String message;
    public ExistingCarException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
