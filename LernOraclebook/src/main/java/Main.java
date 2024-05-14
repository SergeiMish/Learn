
 public class Main {
     public static void main(String[] args) {
         String position = "seller";

         if (position.equals("admin"))
         {
             System.out.println("Доступ разрешен на все ресурсы.");
         }
         else if (position.equals("seller"))
         {
             System.out.println("Доступ разрешен только на просмотр объявлений.");
         }
         else {
                 System.out.println("Проверка окончена.");
             }
         }
     }


