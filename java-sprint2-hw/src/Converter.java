public class Converter {
    final double STEP_LENGHT = 0.75;

    int convertToKm(int steps){
        double step = 1000.0/STEP_LENGHT;
        steps = (int) step;
        return steps;
    }

    int convertStepsToKilocalories(int steps){
        steps = (steps * 50)/1000;
        return steps;
    }

}
