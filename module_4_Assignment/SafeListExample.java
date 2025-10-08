import java.util.concurrent.CopyOnWriteArrayList;

public class SafeListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        new Thread(() -> {
            for (String item : list) {
                System.out.println("Reading: " + item);
                try { Thread.sleep(100); } catch (InterruptedException e) { }
            }
        }).start();


        new Thread(() -> {
            try { Thread.sleep(200); } catch (InterruptedException e) { }
            list.add("D");
            System.out.println("Added: D");
        }).start();
    }
}
