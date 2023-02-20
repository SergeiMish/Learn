public class Electrocar {
        private int id;


        private class MotorCar {
                public void startMotor(){
                        System.out.println("Двигатель " + id + " работает");
                }
        }

        public static void Battery(){
                System.out.println("Батарея заряжается...");
        }

        public Electrocar(int id){
                this.id = id;
        }

        public void start(){
                MotorCar motorCar = new MotorCar();
                motorCar.startMotor();
                System.out.println("Electrocar " + id + " едет");

                class audio{
                public void audioOn(){
                                System.out.println("Музыку громче...");
                        }
                }
        }
}
