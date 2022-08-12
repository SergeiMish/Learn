import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutDown();
    }
    }
    class MyThread extends Thread{
    public volatile boolean running = true;
    public void run(){
        while (running){
        System.out.println("Hello");
        try {
            MyThread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван!");
        }
        }
    }
    public void shutDown(){
        this.running = false;
    }
    }