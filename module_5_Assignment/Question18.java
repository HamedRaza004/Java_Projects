import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// 2. Declare the containing annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
  Schedule[] value();
}

// 1. Declare a repeatable annotation type
@Repeatable(Schedules.class)
@interface Schedule {
  String dayOfMonth() default "first";
  String dayOfWeek() default "Mon";
  int hour() default 12;
}

// 3. Use the repeatable annotation
public class Question18 {
    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour=23)
    public void doPeriodicCleanup() {
        System.out.println("Doing periodic cleanup...");
    }

    public static void main(String[] args) {
        // Example of how to access the annotations via reflection
        try {
            Method method = Question18.class.getMethod("doPeriodicCleanup");
            // Retrieve annotations
            Schedule[] scheduleAnnotations = method.getAnnotationsByType(Schedule.class);
            if (scheduleAnnotations.length > 0) {
                System.out.println(scheduleAnnotations.length + " schedules found:");
                for (Schedule schedule : scheduleAnnotations) {
                    System.out.println("  - Run on " + schedule.dayOfWeek() + " at " + schedule.hour() + ":00, on day '" + schedule.dayOfMonth() + "' of the month.");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
