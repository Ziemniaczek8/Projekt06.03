package Klasa_Thread_Lekcja;

public class Main {

    public static void main(String[] args) {
        Thread d = new Thread(() -> System.out.println("ddwdw"));
        d.start();

        MyThread md = new MyThread();
        md.start();
    }

    public static class MyThread extends Thread {  // mozna tez stworzyc klase rozszerzajaca Thread i nadpisac metode run
        @Override
        public void run() {
            System.out.println("inny wątek");
        }
    }

    /* class Thread implements Runnable { implementuje interfejs Runnable ktory zawiera jedną metodę run()
    /* Make sure registerNatives is the first thing <clinit> does. */
   // private static native void registerNatives(); */
}