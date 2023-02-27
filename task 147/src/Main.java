

public class Main {
    public static void main(String[] args){

    }

    class myThread extends Thread{

        public boolean stop = true;

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
    }
}
