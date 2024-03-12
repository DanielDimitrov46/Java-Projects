import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone {
    static final String PHONE_VALIDATION = "\\+359[0-9]{9}";

    Pattern pattern = Pattern.compile(PHONE_VALIDATION);

    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
             return true;
        } else {
            throw new WrongPhoneNumberException("Invalid phone number");
        }

    }
}
