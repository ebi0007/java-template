package Test_Package_Code;

public class SubClass implements Runnable{

    public void run(){
        System.out.println("Thread B");
        for (int i = 1; i <= 5; i++) {
            System.out.println("From thread B, loop no: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
