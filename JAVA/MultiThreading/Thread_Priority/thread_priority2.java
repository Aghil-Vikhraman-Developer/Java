package Thread_Priority;

public class thread_priority2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " says hi");
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" also says hi");
        });

        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" also says hi");
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
