import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        System.out.println("--- Email Validator ---");
        validateEmail("test@example.com");
        validateEmail("invalid-email");
        validateEmail("another.test@domain.co.uk");
    }

    public static void validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("\"" + email + "\" is a valid email address.");
        } else {
            System.out.println("\"" + email + "\" is not a valid email address.");
        }
    }
}
