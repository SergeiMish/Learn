public class Main {
    public static void main(String[] args) {

    }
}
    interface EuroSocket{
    void getPower();
    }

    interface USSoket{
    void getPower();
    }
    class Radio{
    public void listenMusic(EuroSocket euroSocket){
    euroSocket.getPower();
        }
    }
