
 public class Main {
     public static void main(String[] args) {
         int dirtyLevel = 3;
         boolean isDelicate = true;
         int clothesWeight = 6;

         String washingMode;

         if (dirtyLevel<=2) { // Проверьте уровень загрязнения
             if (isDelicate){
                 washingMode = "Деликатный";
             }
             else {
                 washingMode = "Стандартный";
             }// В случае, если нужна деликатная стирка
             // Режим "Деликатный"
             // Иначе "Стандартный"
         } else {
             if (clothesWeight>=6){
                 washingMode ="Большая загрузка";
             }
             else {
                 washingMode ="Сильные загрязнения";
             }
             // Если вещей больше 5 килограмм
             // Режим "Большая загрузка"
             // Иначе "Сильные загрязнения"
         }
         System.out.println("Выбран режим стирки: " + washingMode);
         // Выведите информацию о выбранном режиме
     }
 }

