package Interfeces;

public class Animal implements Info {
   public int id;
   public Animal(int id){
       this.id = id;
   }

   public void sleep(){
       System.out.println("ZzzzzZZzZZz");
   }

    @Override
    public void showInfo() {
        System.out.println("Id животного " + this.id);
    }
}
