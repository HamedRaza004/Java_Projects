import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
    String message() default "The field must have a minimum length.";
}

class UserForQ21 {
    @MinLength(value = 5, message = "Username must be at least 5 characters long")
    private String username;

    public UserForQ21(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Question21 {
    public static void main(String[] args) {
        UserForQ21 user1 = new UserForQ21("longusername");
        UserForQ21 user2 = new UserForQ21("short");

        System.out.println("Validating user1:");
        validate(user1);
        System.out.println("\nValidating user2:");
        validate(user2);
    }

    public static void validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MinLength.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    MinLength minLength = field.getAnnotation(MinLength.class);
                    if (value.length() < minLength.value()) {
                        System.out.println("  Validation failed for field '" + field.getName() + "': " + minLength.message());
                    } else {
                        System.out.println("  Validation passed for field '" + field.getName() + "'.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
