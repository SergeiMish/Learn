public class Dog extends Animal{
    public Dog(int id) {
        super(id);
    }

    @Override
    public void run() {
            System.out.println("Собака бегает");

    }
}
