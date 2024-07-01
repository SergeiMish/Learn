public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) +  " день: " + sumStepsFromMonth());
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
            if (days[i] > maxSteps){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= days[i - 1]){
                currentSeries++;
            }
            else currentSeries = 0;
            if (currentSeries >= goalByStepsPerDay){
                finalSeries = goalByStepsPerDay;
            }
            // поиск максимальной серии
        }
        return finalSeries;
    }
}
