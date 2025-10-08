import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class TimedTasks {
    @LogExecutionTime
    public void doSomethingThatTakesTime() throws InterruptedException {
        System.out.println("  Doing a task that will be timed...");
        Thread.sleep(150); // Simulate work
        System.out.println("  ...task finished.");
    }

    public void doSomethingElse() {
        // Not timed
    }

    @LogExecutionTime
    public void anotherTimedTask() throws InterruptedException {
        System.out.println("  Doing another task that will be timed...");
        Thread.sleep(50); // Simulate work
        System.out.println("  ...another task finished.");
    }
}

public class Question29 {
    public static void main(String[] args) {
        System.out.println("Using @LogExecutionTime annotation to time methods.\n");
        TimedTasks tasks = new TimedTasks();
        Class<?> clazz = tasks.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    System.out.println("Found timed method: '" + method.getName() + "'. Invoking now.");
                    long startTime = System.nanoTime();
                    method.invoke(tasks);
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) / 1_000_000; // milliseconds
                    System.out.println("-> Execution of '" + method.getName() + "' took " + duration + "ms.\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
