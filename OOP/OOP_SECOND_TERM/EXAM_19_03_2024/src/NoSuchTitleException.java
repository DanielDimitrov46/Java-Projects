public class NoSuchTitleException extends Exception {
    private String message;

    public NoSuchTitleException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
