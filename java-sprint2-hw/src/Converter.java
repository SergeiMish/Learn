public class Converter {
    final double STEP_LENGHT = 0.75;

    int convertToKm(int steps) {
        double step = (STEP_LENGHT * steps) / 1000;
        steps = (int) step;
        return steps;
    }

    int convertStepsToKilocalories(int steps) {
        steps = (steps * 50) / 1000;
        return steps;
    }
}
