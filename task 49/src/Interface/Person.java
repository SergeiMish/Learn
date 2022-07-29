package Interface;

public class Person implements Info {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public void myName(){
        System.out.println("Человек");
    }

    public void showInfo() {
        System.out.println("И имя мне - " + this.name);
    }
}
