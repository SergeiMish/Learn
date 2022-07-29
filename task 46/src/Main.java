public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Xbk", 40);
        System.out.println(h1);

    }
}
    class Human {
        private int age;
        private String name;
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String toString(){
            return name + ", " + age;
        }
    }

