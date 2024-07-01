public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(days + " день: " );
        }
    }
    int sumStepsFromMonth(){
        int sumStep = 0;
        for (int i = 0; i < days.length; i++) {
            sumStep = days[i] + sumStep;
        }
        return sumStep;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            System.out.println();
            }
        return maxSteps;
    }
}
