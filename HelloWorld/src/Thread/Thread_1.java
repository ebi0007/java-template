package Thread;

public class Thread_1 implements Runnable {
    public void run(){
        System.out.println("Thread 1 is started.");
        try {
            for (int i=1;i<=10;i++) {
                System.out.println("Thread 1.Number is: "+i);
                Thread.sleep(2);
            }
        }catch (InterruptedException e){
            System.out.println();
        }finally {
            System.out.println("Thread 1 is finished.");
        }


    }
}
