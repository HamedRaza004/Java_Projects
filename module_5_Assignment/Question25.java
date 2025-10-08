import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExecuteWithRoles {
    String[] roles();
}

public class Question25 {

    @ExecuteWithRoles(roles = {"ADMIN", "EDITOR"})
    public void performAdminTask() {
        System.out.println("Performing a task that requires ADMIN or EDITOR role.");
    }

    @ExecuteWithRoles(roles = {"VIEWER"})
    public void performViewerTask() {
        System.out.println("Performing a task that requires VIEWER role.");
    }

    // Single element array can be written without curly braces
    @ExecuteWithRoles(roles = "SUPER_ADMIN")
    public void performSuperAdminTask() {
        System.out.println("Performing a task that requires SUPER_ADMIN role.");
    }

    public static void main(String[] args) {
        System.out.println("Yes, annotations can take arrays as parameters. Here is an example:\n");

        for (Method method : Question25.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ExecuteWithRoles.class)) {
                ExecuteWithRoles annotation = method.getAnnotation(ExecuteWithRoles.class);
                String[] roles = annotation.roles();
                System.out.println("Method '" + method.getName() + "' requires roles: " + Arrays.toString(roles));
            }
        }
    }
}
