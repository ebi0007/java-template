package Thread;

public class Thread_A extends Thread {
    @Override
    public void run(){
        System.out.println("Thread A is started.");
        try {
            for (int i=1;i<=5;i++) {
                System.out.println("Thread A.Number is: "+i);
                Thread.sleep(2);
            }
        }catch (InterruptedException e){
            System.out.println();
        }finally {
            System.out.println("Thread A is finished.");
        }


    }
}
