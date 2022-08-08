public class Electrocar {
    private int id;
    private class motor{
        public void startMotor(){
            System.out.println("Мотор заработал");
        }
        }
    public Electrocar (int id){
        this.id = id;
    }
    public void start() {
        System.out.println("Електромобиль" + id + "Мотор работает");
    }
}
