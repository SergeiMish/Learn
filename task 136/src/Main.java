public class Main {
    public static void main(String[] args) {
      Moto moto1 = new Moto();
      moto1.name = "Harley Davidson";
      Moto moto2= new Moto();
      moto2.name = "Yamaxa";
      moto1.ride();
      moto2.ride();


    }
    static class Moto{
        String name;
        int age;
        void ride(){
            for (int i = 0; i<3; i++){
                System.out.println("Я еду на " + name);
            }
        }
    }
}
