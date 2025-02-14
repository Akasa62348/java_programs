class RunnableThread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread1");
        }
    }
}

class RunnableThread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread2");
        }
    }
}

class RunnableThread3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread3");
        }
    }
}

public class MainThread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThread1());
        Thread t2 = new Thread(new RunnableThread2());
        Thread t3 = new Thread(new RunnableThread3());

        t1.start();
        t2.start();
        t3.start();
    }
}
