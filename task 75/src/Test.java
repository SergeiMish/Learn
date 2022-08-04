class Animal {
        public void eat() {
            System.out.println("Животное ест");
        }
    }
        public class Test {
            public static void main(String[] args) {
                Animal animal = new Animal();
                animal.eat();
                Animal animal2 = new Animal() {
                    public void eat(){
                        System.out.println("Животное есть чуть чуть");
                    }
                }; animal2.eat();

            }
        }
