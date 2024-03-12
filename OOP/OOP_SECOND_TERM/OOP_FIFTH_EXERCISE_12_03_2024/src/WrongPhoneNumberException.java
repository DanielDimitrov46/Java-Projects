public class WrongPhoneNumberException extends Exception{
    private String message;

    public WrongPhoneNumberException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
