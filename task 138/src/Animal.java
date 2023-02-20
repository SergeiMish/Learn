public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
