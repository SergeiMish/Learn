public class Main {
    public static void main(String[] args) {
      Moto moto1 = new Moto();
      moto1.name = "Harley Davidson";
      moto1.ride();


    }
    static class Moto{
        String name;
        int age;
        void ride(){
            System.out.println("Я еду на" + name);
        }
    }
}
