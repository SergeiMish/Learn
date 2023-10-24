
 public class Main {
     public static void eatMore(boolean hungry, int amountOfFood) {
         12: int roomInBelly = 5;
          if (hungry) {
              var timeToEat = true;
              while (amountOfFood > 0) {
                 int amountEaten = 2;
                  roomInBelly = roomInBelly -amountEaten;
                  amountOfFood = amountOfFood -amountEaten;
                 }
             }
          System.out.println(amountOfFood);
         }