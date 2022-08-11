public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.MOUSE;
        System.out.println(animal.getTraslation());
        Animal animal2 = Animal.valueOf("MOUSE");
        System.out.println(animal2.getTraslation());
        System.out.println(animal.ordinal());

    }
}
