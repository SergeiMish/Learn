public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.age = 15;
        human1.name = "Мистер Пиклз";
        human1.getAgeAndName();
    }

    static class Human {
        private int age;
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        void getAgeAndName(){
            System.out.println(name + " " + age);
        }

    }
}
