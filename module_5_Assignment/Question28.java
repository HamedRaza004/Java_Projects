import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyTestMethod {
    String info() default "default info";
}

class MyTestClass {
    @MyTestMethod(info = "This is the first test method.")
    public void testMethod1() {
        System.out.println("--> Executing testMethod1");
    }

    public void testMethod2() {
        // Not annotated, so it will be ignored by our processor.
    }

    @MyTestMethod(info = "This is the second test method.")
    public void testMethod3() {
        System.out.println("--> Executing testMethod3");
    }
}

public class Question28 {
    public static void main(String[] args) {
        System.out.println("Demonstrating processing of custom annotations via reflection.\n");
        MyTestClass myTest = new MyTestClass();
        Class<?> clazz = myTest.getClass();

        // Iterate over all methods of the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method is annotated with @MyTestMethod
            if (method.isAnnotationPresent(MyTestMethod.class)) {
                MyTestMethod testAnnotation = method.getAnnotation(MyTestMethod.class);

                System.out.println("Found annotated method: " + method.getName());
                System.out.println("  Annotation info: " + testAnnotation.info());

                try {
                    // Execute the annotated method using reflection
                    method.invoke(myTest);
                } catch (Exception e) {
                    System.err.println("  Error invoking method " + method.getName());
                    e.printStackTrace();
                }
                System.out.println(); // for spacing
            }
        }
    }
}
