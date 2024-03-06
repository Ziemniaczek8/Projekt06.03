package Zad_35;

public class MyRunnable extends Thread{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());;
    }
}
