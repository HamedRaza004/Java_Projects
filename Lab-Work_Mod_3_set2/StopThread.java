class StoppableThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        int count = 1;
        while (running && count <= 100) {
            System.out.println("Count: " + count);
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }
}

public class StopThread {
    public static void main(String[] args) {
        StoppableThread t = new StoppableThread();
        t.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping the thread...");
        t.stopThread();
    }
}
