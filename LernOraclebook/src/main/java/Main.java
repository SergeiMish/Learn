import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         double rateUSD = 95.0;
         double rateEUR = 99.58;
         double rateCNY = 13.05;


         System.out.println("Введите сумму рублей для конвертации:");
         double roubles = NumberReader.getDouble();

         System.out.println("Введите номер валюты, в какую перевести рубли:");

         System.out.println("1 – доллары;");
         System.out.println("2 – евро;");
         System.out.println("3 – юани;");
         int command = NumberReader.getInteger();

         if (command == 1){

             double USD = roubles / rateUSD;
             System.out.println("Было введено " + roubles + ", в долларах это " + USD);

         }
         else if (roubles<=0){
             System.out.println("Ошибка: некорректные значения.");
         }
         else if (command == 2){
             double EUR = roubles / rateEUR;
             System.out.println("Было введено " + roubles + ", в долларах это " + EUR);
         }
         else if (command == 3){
             double CNY = roubles / rateCNY;
             System.out.println("Было введено " + roubles + ", в долларах это " + CNY);
         }
         else System.out.println ("Такой команды нет");

         System.out.println ("Работа с программой завершена.");
     }
}