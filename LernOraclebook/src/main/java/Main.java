
 public class Main {
     public static void main(String[] args) {
         int age = 23;
         String dayOfWeek = "SATURDAY";

         int ticketPrice = 10;
         if (age <=6 ){
             ticketPrice = 0;
             System.out.println ("Проезд бесплатный");
         }
         else if (age >= 65){
             dayOfWeek.equals("SUNDAY");
             ticketPrice = 3;
         }
         else if (age >= 65){
             ticketPrice = 5;
         }
         else if (dayOfWeek.equals("MONDAY")){
             ticketPrice = 8;
         }
         System.out.println("Цена билета составляет: " + ticketPrice);
     }
 }
