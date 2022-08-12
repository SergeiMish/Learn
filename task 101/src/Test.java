public class Test {
    public static void main(String[] args) {

    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++)
            System.out.println("Я в потоке");
    }
}
