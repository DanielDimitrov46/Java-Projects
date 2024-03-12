import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private Pattern pattern;

    private Matcher matcher;

    private static final String EMAIL_PATTERN =

                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {

        pattern = Pattern.compile(EMAIL_PATTERN);

    }

    public boolean validateMail(final String checkedMail) {

        matcher = pattern.matcher(checkedMail);

        return matcher.matches();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String email2 = scanner.nextLine();
        EmailValidator validator = new EmailValidator();
        System.out.println(validator.validateMail(email));
        System.out.println(validator.validateMail(email2));
    }
}
