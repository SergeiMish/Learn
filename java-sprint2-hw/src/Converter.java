public class Converter {
    final double STEP_LENGHT = 0.75;
    final int KM = 1000;
    final int KCAL = 1000;
    final int CAL = 50;

    int convertToKm(int steps) {
        double step = (STEP_LENGHT * steps) / KM;
        steps = (int) step;
        return steps;
    }

    int convertStepsToKilocalories(int steps) {
        steps = (steps * CAL) / KCAL;
        return steps;
    }
}
