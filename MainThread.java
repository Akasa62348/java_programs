class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread1");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread2");
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread3");
        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
