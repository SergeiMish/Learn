package Interface;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Боб");
        Animal a1 = new Animal(225);
        p1.showInfo();
        a1.showInfo();
    }
}
