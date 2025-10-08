import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Can be applied to classes
@interface AuthorAndVersion {
    String author();
    String version() default "1.0";
}

@AuthorAndVersion(author = "Gemini")
public class Question22 {
    public static void main(String[] args) {
        Class<?> clazz = Question22.class;
        if (clazz.isAnnotationPresent(AuthorAndVersion.class)) {
            AuthorAndVersion info = clazz.getAnnotation(AuthorAndVersion.class);
            System.out.println("This class was written by: " + info.author());
            System.out.println("Current version: " + info.version());
        }
    }
}
