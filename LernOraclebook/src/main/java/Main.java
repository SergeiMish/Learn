
 public class Main {
     public static void eatMore(boolean hungry, int amountOfFood) {
         12: int roomInBelly = 5;
         13: if (hungry) {
             14: var timeToEat = true;
             15: while (amountOfFood > 0) {
                 int amountEaten = 2;
                  roomInBelly = roomInBelly -amountEaten;
                  amountOfFood = amountOfFood -amountEaten;
                 }
             }
          System.out.println(amountOfFood);
         }