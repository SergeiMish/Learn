public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.age = 30;
        person1.name = "Ляйсан";

    }
}
        class Person{
            int age;
            String name;

            int CallculateYersAndRetaiment(){
                int years = 65 - age;
                return years;
            }}

