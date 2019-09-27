package Thread;

public class Thread_2 implements Runnable {
    public void run(){
        System.out.println("Thread 2 is started.");
        try {
            for (int i=1;i<=10;i++) {
                System.out.println("Thread 2.Number is: "+i);
                Thread.sleep(3);
            }
        }catch (InterruptedException e){
            System.out.println();
        }finally {
            System.out.println("Thread 2 is finished.");
        }



    }

}
