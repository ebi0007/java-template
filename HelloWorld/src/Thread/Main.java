package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args){

//نحوه ایجاد ترد با کلاس Thread *************************
          Thread_A a=new Thread_A();
//        a.start();
          Thread_B b=new Thread_B();
//        b.start();
//**  ایجاد ترد با ایمپلیمنت کردن اینترفیس Runnable *************************
//        Thread_1 a1= new Thread_1();
//        Thread tr1= new Thread(a1);
//        tr1.start();
//
//        Thread_2 b1=new Thread_2();
//        Thread tr2=new Thread(b1);
//        tr2.start();
//نحوه کنترل کردن تردها با     ExecutorService    *************************
        ExecutorService mycontroler= Executors.newSingleThreadExecutor();
        mycontroler.submit(a);
        mycontroler.submit(b);
        mycontroler.shutdown();



    }
}
