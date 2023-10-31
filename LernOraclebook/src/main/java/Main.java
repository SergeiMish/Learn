
 public class Main {
     public static void main(String[] args) {

     }
     public void eatMore(boolean hungry, int amountOfFood) {
         int roomInBelly = 5;
         if (hungry) {
             var timeToEat = true;
             while (amountOfFood > 0) {
                 int amountEaten = 2;
                 roomInBelly = roomInBelly - amountEaten;
                 amountOfFood = amountOfFood - amountEaten;
