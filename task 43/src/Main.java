public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Том", 30);
        Human h2 = new Human("Билл", 21);
        h1.getPeople();
    }
}
    class Human {
        private int age;
        private String name;
        private static int numberOfPeople;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public Human(String name,   int age){
            this.age = age;
            this.name = name;
            numberOfPeople++;
        }
        public void getPeople(){
            System.out.println(numberOfPeople);

        }

    }