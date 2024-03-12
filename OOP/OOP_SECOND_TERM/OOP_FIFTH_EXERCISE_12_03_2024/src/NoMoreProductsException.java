public class NoMoreProductsException extends Exception{
    private String message;

    public NoMoreProductsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
