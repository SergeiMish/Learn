public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Михаил");
        human1.setAge(25);
        System.out.println("Меня зовут " + human1.getName() + " мне " + human1.getAge());

    }
}
    class Human {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
