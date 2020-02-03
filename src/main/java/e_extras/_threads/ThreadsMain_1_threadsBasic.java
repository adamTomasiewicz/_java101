package t_threads;

public class ThreadsMain_1_threadsBasic {

    //ta metoda odpali watek podstawowy
    public static void main(String[] args) {
        System.out.println("New Thread start: ");
        Runnable target;
        Thread thread1 = new Thread(() -> {
            System.out.println("start Thread1 ");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread1 count: " + i + "\033[33m");
            }
            System.out.println("end Thread1 ");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("start Thread2 ");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 count: " + i + "\003[33m");
            }
            System.out.println("end Thread2 ");
        });
        System.out.println();
        thread1.start();
        thread2.start();
        System.out.println("end application");
    }
}
