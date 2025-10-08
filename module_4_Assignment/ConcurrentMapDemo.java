import java.util.concurrent.*;
class ConcurrentMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        Runnable task = () -> { for (int i = 0; i < 1000; i++) map.put(i, "Val"+i); };
        Thread t1 = new Thread(task); Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Size: " + map.size());
    }
}
