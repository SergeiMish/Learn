public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.setName("Yamaha");
        moto1.setAge(12);
        System.out.println("Выводи на экран в main методе: " + moto1.getName());
        System.out.println("Выводи на экран в main методе: " + moto1.getAge());


    }
}
    class Moto {
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
    void goRide() {
        System.out.println("Я еду на " + name + " и ему всего " + age);
    }

}

