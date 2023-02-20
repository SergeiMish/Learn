public class Electrocar {
        private int id;


        private class MotorCar {
                public void startMotor(){
                        System.out.println("Двигатель " + id + " работает");
                }
        }

        public Electrocar(int id){
                this.id = id;
        }

        public void start(){
                MotorCar motorCar = new MotorCar();
                motorCar.startMotor();
                System.out.println("Electrocar " + id + " едет");
        }
}
