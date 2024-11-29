

public class daemon {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Daemon_Thread());
        Thread t2 = new Thread(new User_thread());
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}


class Daemon_Thread implements Runnable{
    @Override
    public void run(){
        int count = 0;
        while(count<10){
            try { Thread.sleep(1000);} catch (Exception e) {}
            count++;
            System.out.println("Running in the background");
        }
    }
}
    
    class User_thread implements Runnable{
        @Override
        public void run(){
            int count = 0;
            while(count<10){
                try { Thread.sleep(5000);} catch (Exception e) {}
                count++;
                System.out.println("Thread given by the user");
            }
        }
    }