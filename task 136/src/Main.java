public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.name = ("Harley Davidson");
        Moto moto2 = new Moto();
        moto2.name = "Yamaxa";
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
    }

    void goRide() {
        System.out.println("Я еду на " + name + " и ему всего " + age);
    }

}

