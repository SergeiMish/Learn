public class Main {
    public static void main(String[] args) {
        41: final int score1 = 8, score2 = 3;
             42: char myScore = 7;
             43: var goal = switch (myScore) {
            44: default ->{if(10>score1) yield "unknown";}
            45: case score1 -> "great";
            46: case 2, 4, 6 ->"good";
        47: case score2, 0 -> {"bad";}
        48: };
        49: System.out.println(goal);
}
