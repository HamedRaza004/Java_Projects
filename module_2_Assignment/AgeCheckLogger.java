import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeCheckLogger {
    private static final Logger logger = Logger.getLogger("AgeLogger");

    static {
        try {
            FileHandler fileHandler = new FileHandler("age_errors.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            System.out.println("Failed to set up logger: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted. Age: " + age);
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            logger.severe("InvalidAgeException: " + e.getMessage());
            System.out.println("Exception handled and logged.");
        }
    }
}
