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

     public void // объявите метод sayHelloByTime
            ...// спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
            ...// в зависимости от времени предусмотрите печать приветствий
            ...
            ...
            ...


            ... // объявите метод printSuccess
            ... // метод printSuccess должен печатать строку "У вас уже неплохо получается программировать!"


}