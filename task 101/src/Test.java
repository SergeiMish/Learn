public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
        System.out.println("Я сплю");
        Thread.sleep(3000);
        System.out.println("Я проснулся");
    }
}
//class MyThread extends Thread{
//    public void run(){
//        for (int i = 0; i < 1000; i++)
//            System.out.println("Я в потоке " + i);
//    }
//}
