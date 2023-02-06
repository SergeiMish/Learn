public class Main {
    public static void main(String[] args) {
      Moto moto1 = new Moto();
      moto1.name = "Harley Davidson";
      Moto moto2= new Moto();
      moto2.name = "Yamaxa";
      moto1.gasolineConsumption();




    }
    static class Moto{
        String name;
        int age;
        int middleConsumption = 15;
        int gasolineConsumption(){
            int hp = 100/middleConsumption;
            return hp;
        }
        void ride(){
            for (int i = 0; i<3; i++){
                System.out.println("Я еду на " + name);
            }
        }
        void gasOnTop(){
            for (int i = 0; i<3; i++){
                System.out.println("Ручку в упор, тапку в пол на " + name);
            }
        }
    }
}
