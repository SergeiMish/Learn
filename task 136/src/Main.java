public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Мерлин", 180);
        Human h2 = new Human("Борис",20);
        Human h3 = new Human("Лариса", 26);
        h1.countOfPeople();
        h3.countOfPeople();
    }
}
    class Human {
        private String name;
        private int age;

        public static int countPeople;

        public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;

        }
        public void countOfPeople(){
            System.out.println("Количество людей в чате: " + countPeople);
        }
    }
