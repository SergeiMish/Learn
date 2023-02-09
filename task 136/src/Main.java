public class Main {
    public static void main(String[] args) {
     Human h1 = new Human("Томас", 25);


        System.out.println(h1.toString());
    }
}

class Human{
    String name;
    int age;

      public Human(String name, int age){
      this.name = name;
      this.age = age;
      }
}