import java.util.Scanner;

public class Practicum {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public void welcomeUserByName() { // объявите метод welcomeUserByName
        System.out.println("Как вас зовут?");
        String name = scanner.next();
         // сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

     public void sayHelloByTime(){
         System.out.println("Который час");
         int currentHour = scanner.nextInt();
         if (currentHour > 22 & currentHour < 6){
             System.out.println("Доброй ночи!");
         }
         else if (currentHour > 6 && currentHour < 12){
             System.out.println("Доброе утро!");
         }
         else if (currentHour > 12 && currentHour < 18){
             System.out.println("Добрый день!");
         }
         else if (currentHour > 18 && currentHour < 22){
             System.out.println("Добрый вечер!");
         }
    }// объявите метод sayHelloByTime
            // спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
            // в зависимости от времени предусмотрите печать приветствий
    public void printSuccess(){
        System.out.println("У вас уже неплохо получается программировать!");
    }
            // объявите метод printSuccess
             // метод printSuccess должен печатать строку "У вас уже неплохо получается программировать!"


}