public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.setName("");
        moto1.setAge(12);
        System.out.println("Выводим на экран в main методе: " + moto1.getName());
        System.out.println("Выводим на экран в main методе: " + moto1.getAge());


    }
}
    class Moto {
        private String name;
        private int age;

        public void setName(String userName) {
            if (userName.isEmpty()){
                System.out.println("Вы не ввели имя");
            }
            else {
                name = userName;
            }
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

