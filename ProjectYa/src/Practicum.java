
public class Practicum {
    public static void main(String[] args) {
        Cat cat1 = new Cat("������");
        Cat cat2 = cat1;
        cat1 = new Cat("������");
        System.out.println("��� 1: " + cat1.name + ", ��� 2: " + cat2.name);
    }
}

class Cat {
    String name;

    public Cat(String catName) {
        name = catName;
    }
}