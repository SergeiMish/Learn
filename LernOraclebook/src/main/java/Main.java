
 public class Main {
     public static void main(String[] args) {
         String season = "spring";
         int totalPeople = 5;
         int dancers = 2;
         int gamePlayers = 3;
         int temperature = 20;

         if (season.equals("summer")) {
             System.out.println("Пойдём гулять"); // Если это так – выведите сообщение с предложением погулять
         } else if (temperature>=15) { // Проверьте, что на улице тепло
             System.out.println("Пойдём в кафе на веранду!");   // Выведите соответствующее сообщение
         } else if (dancers>0) { // Проверьте, есть ли желающие потанцевать
             System.out.println("Пойдём в бар!"); // Выведите соответствующее сообщение
         } else if (gamePlayers>=totalPeople) { // Проверьте, все ли хотят играть в настольные игры
             System.out.println("Пойдём к кому-то в гости и поиграем в настольные игры!");  // Выведите соответствующее сообщение
         }
     }
 }

