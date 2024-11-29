package Runnable_Thread;
//using interface
public class runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_One());
        Thread t2 = new Thread(new Thread_Two());

        t1.start();
        t2.start();
    }
}

class Thread_One implements Runnable{
    
    @Override
    public void run(){
        for(int i =1 ; i<=5; i++){
            System.out.println("Thread one : "+i);
        }
    }
}

class Thread_Two implements Runnable{
    
    @Override
    public void run(){
        for(int i =1 ; i<=5; i++){
            System.out.println("Thread two : "+i);
        }
    }
}