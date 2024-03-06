package Zad_36;

public class ThreadPlaygroundRunnable implements Runnable{

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + name + " loop nr: " + i);
        }
    }


}
