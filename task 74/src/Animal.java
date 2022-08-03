public class Animal {
    private int id;
   public Animal(int id){
       this.id = id;
   }
   public void eat(){
       System.out.println("Я ем");
   }
   public Animal(){
   }
   public String toString(){
       return String.valueOf(id);
   }
}
