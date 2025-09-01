import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SET_3_Question_5 {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
