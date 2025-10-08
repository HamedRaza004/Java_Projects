import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface StringLength {
    int min() default 0;
    int max() default 255;
    String message() default "String length is not valid";
}

class Product {
    @StringLength(min = 2, max = 10, message = "Product name must be between 2 and 10 characters")
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }
}

public class Question17 {
     public static void main(String[] args) {
        Product product1 = new Product("Laptop");
        Product product2 = new Product("L");
        Product product3 = new Product("A very long product name");

        validate(product1);
        validate(product2);
        validate(product3);
    }

    public static void validate(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(StringLength.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    StringLength length = field.getAnnotation(StringLength.class);
                    if (value.length() < length.min() || value.length() > length.max()) {
                        System.out.println("Validation failed for " + field.getName() + ": " + length.message());
                    } else {
                        System.out.println("Validation passed for " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
