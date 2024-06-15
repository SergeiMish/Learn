import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isTrafficLightGreen = false;

        boolean isVehicleApproaching = false;

        System.out.println("Вы находитесь около пешеходного перехода (да/нет)?");
        String onCrosswalk = scanner.nextLine();
        boolean isOnCrosswalk = ... // проверьте, ответил ли пользователь утвердительно

        if (...) {
            // Если пешеход находится на пешеходном переходе:
            System.out.println("Горит ли зелёный сигнал светофора (да/нет)?");
            String trafficLightGreen = scanner.nextLine();
            isTrafficLightGreen = ...
            if (...) {
                // Если светофор красный:
                System.out.println("Не переходите дорогу на красный свет светофора!");
            }
        } else {
            // Если к пешеходу приближается транспортное средство:
            System.out.println("Видите ли вы приближающиеся автомобили (да/нет)?");
            String vehicleApproaching = scanner.nextLine();
            isVehicleApproaching = ...
            if (...) {
                System.out.println("Дождитесь, пока проедет транспортное средство!");
            }
        }

        boolean isSafePlace = false;

        if(...) {
            // Проверка на перебежку дороги в небезопасном месте:
            System.out.println("Находится ли вблизи вас поворот (П), остановка (А), перекрёсток (Х) или нет?");
            String unsafePlaceType = scanner.nextLine();
            switch (unsafePlaceType) {
                ...:
                System.out.println("Не перебегайте дорогу вблизи поворотов!");

                ...:
                System.out.println("Не перебегайте дорогу вблизи перекрестков!");

                ...:
                System.out.println("Не перебегайте дорогу вблизи остановок общественного транспорта!");

                default:
                    isSafePlace = ...

            }
        }

        if(???) {
            System.out.println("Вы можете перейти дорогу!");
            System.out.println("Сколько полос движения на дороге?");
            int linesCount =
            if(???){
                System.out.println("Посмотрите в обе стороны и переходите.");
            } else {
                int halfWay = ...
                for(int line = 1; ...){
                    if(???){
                        System.out.println("Посмотрите налево и переходите.");
                    } else {
                        System.out.println("Посмотрите направо и переходите.");
                    }
                }
            }
        } else {
            System.out.println("Вы не можете перейти дорогу в этом месте!");
        }
    }
}