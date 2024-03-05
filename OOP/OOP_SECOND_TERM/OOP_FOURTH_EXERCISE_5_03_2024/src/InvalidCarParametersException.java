public class InvalidCarParametersException extends Exception {
    private final String message;

    public InvalidCarParametersException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
