
 public class Main {
     public static void eatMore(boolean hungry, int amountOfFood) {
         12: int roomInBelly = 5;
         13: if (hungry) {
             14: var timeToEat = true;
             15: while (amountOfFood > 0) {
                 16: int amountEaten = 2;
                 17: roomInBelly = roomInBelly -amountEaten;
                 18: amountOfFood = amountOfFood -amountEaten;
                 19: }
             }
          System.out.println(amountOfFood);
         }