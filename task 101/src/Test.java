public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Я в первом потоке");

    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++)
            System.out.println("Я в потоке");
    }
}
