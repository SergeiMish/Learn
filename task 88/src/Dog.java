public class Dog extends Animal {
    public void eat(){
        System.out.println("Собака ест");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}
