class BankAccount2 {
    private int balance = 0;
    private final Object lock = new Object();

    public void deposit(int amount) {
        synchronized (lock) {
            int newBalance = balance + amount;
            System.out.println(Thread.currentThread().getName() + " is depositing " + amount + ", new balance will be " + newBalance);
            balance = newBalance;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(1);
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(1);
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
