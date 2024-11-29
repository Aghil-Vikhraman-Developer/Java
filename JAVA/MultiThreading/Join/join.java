package Join;

public class join {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread 1: "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread 2: "+i);
            }
        });

        t1.start();
        t2.start();

        try {
                    //join method waits till the previous thread to complete the execution and then the main thread is executed
        t1.join();
        t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Done executing the strings.");//main thread has the highest priority
    }
}
