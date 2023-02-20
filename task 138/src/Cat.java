public class Cat extends Animal{

    public Cat(int id) {
        super(id);
    }

    @Override
    public void run() {
        System.out.println("Кошка бегает");

    }
}
