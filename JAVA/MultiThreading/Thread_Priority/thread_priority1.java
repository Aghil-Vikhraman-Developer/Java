package Thread_Priority;

public class thread_priority1 {
    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName()); 
       System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
       System.out.println(Thread.currentThread().getPriority());
    }
    
}
