import java.util.*;
class VectorThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>();
        Runnable task = () -> { for (int i = 0; i < 1000; i++) v.add(i); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Size: " + v.size());
    }
}
