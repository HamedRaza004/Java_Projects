import java.lang.reflect.Method;

class Task {
    @TrackExecution("data-processing")
    public void processData() {
        System.out.println("Processing data...");
    }

    @TrackExecution("file-saving")
    public void saveFile() {
        System.out.println("Saving file...");
    }

    public void loadData() {
        System.out.println("Loading data...");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Task myTask = new Task();
        Class<?> taskClass = myTask.getClass();

        for (Method method : taskClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TrackExecution.class)) {
                TrackExecution annotation = method.getAnnotation(TrackExecution.class);
                System.out.println("Method: " + method.getName() + " is tracked.");
                System.out.println("Annotation value: " + annotation.value());
                try {
                    method.invoke(myTask);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
