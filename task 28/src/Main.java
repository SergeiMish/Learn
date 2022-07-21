public class Main {
    public static void main(String[] args) {
        int populations = 10000000;
        int born = 14;
        int die = 8;
        int midleBorn = born - die;
        for (int i=1; i <= 10; i++);{
        populations += populations * midleBorn/1000;
        System.out.println(populations);
    }
}}