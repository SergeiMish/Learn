import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.stopRun();


    }
}

    class MyThread extends Thread{

        private volatile boolean stop = true;

        public void run(){
            while (stop){
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public void stopRun(){
            this.stop = false;
        }
    }
