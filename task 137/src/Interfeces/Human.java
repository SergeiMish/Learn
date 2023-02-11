package Interfeces;

public class Human implements Info {
    public String name;

    public Human(String name){
        this.name = name;
    }

    public void hello(){
        System.out.println("Привет");
    }

    @Override
    public void showInfo() {
        System.out.println("Имя человека " + this.name);
    }
}

