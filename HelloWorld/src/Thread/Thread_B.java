package Thread;

public class Thread_B extends Thread {
    @Override
    public void run(){
        System.out.println("Thread B is started.");
        try {
            for (int i=1;i<=5;i++) {
                System.out.println("Thread B.Number is: "+i);
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println();
        }finally {
            System.out.println("Thread B is finished.");
        }


    }
}
