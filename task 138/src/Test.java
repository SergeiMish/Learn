public class Test {
    public static void main(String[] args) {
     Eat eat = new Eat() {
         @Override
         public void eat() {
             System.out.println("Животное ест ");
         }
     };eat.eat();
}
}