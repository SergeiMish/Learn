<<<<<<< HEAD
public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(-6);
        person1.setName("");
        person1.speak();
    }
}
class Person {
    private int age;
    private String name;

    int CallculateYersAndRetaiment() {
        int years = 65 - age;
        return years;
    }

    public void setName(String username) {
        if (username.isEmpty()) System.out.println("Поле пустое");
        else name = username;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) System.out.println("Некорретный ввод");
        else age = userAge;}
    int getAge(){
        return age;
    }

        void speak () {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }
=======
public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(-6);
        person1.setName("");
        person1.speak();
    }
}
class Person {
    private int age;
    private String name;

    int CallculateYersAndRetaiment() {
        int years = 65 - age;
        return years;
    }

    public void setName(String username) {
        if (username.isEmpty()) System.out.println("Поле пустое");
        else name = username;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) System.out.println("Некорретный ввод");
        else age = userAge;}
    int getAge(){
        return age;
    }

        void speak () {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }
>>>>>>> origin/main
}