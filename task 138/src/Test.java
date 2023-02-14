

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
    }
    Animal animal2 = new Animal(){
        @Override
        public void eat(){
            System.out.println("Второе животное есть");
        }
    };
}