import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isTrafficLightGreen = false;

        boolean isVehicleApproaching = false;

        System.out.println("Вы находитесь около пешеходного перехода (да/нет)?");
        String onCrosswalk = scanner.nextLine();
        boolean isOnCrosswalk = onCrosswalk.equals("да"); // проверьте, ответил ли пользователь утвердительно

        if (isOnCrosswalk) {
            // Если пешеход находится на пешеходном переходе:
            System.out.println("Горит ли зелёный сигнал светофора (да/нет)?");
            String trafficLightGreen = scanner.nextLine();
            isTrafficLightGreen = trafficLightGreen.equals("да");
            if (trafficLightGreen.equals("нет")) {
                // Если светофор красный:
                System.out.println("Не переходите дорогу на красный свет светофора!");
            }
        } else {
            // Если к пешеходу приближается транспортное средство:
            System.out.println("Видите ли вы приближающиеся автомобили (да/нет)?");
            String vehicleApproaching = scanner.nextLine();
            isVehicleApproaching = vehicleApproaching.equals("да");
            if (vehicleApproaching.equals("нет")) {
                System.out.println("Дождитесь, пока проедет транспортное средство!");
            }
        }

        boolean isSafePlace = false;

        if(isSafePlace) {
            // Проверка на перебежку дороги в небезопасном месте:
            System.out.println("Находится ли вблизи вас поворот (П), остановка (А), перекрёсток (Х) или нет?");
            String unsafePlaceType = scanner.nextLine();
            switch (unsafePlaceType) {
                case "П":
                System.out.println("Не перебегайте дорогу вблизи поворотов!");

                case "А":
                System.out.println("Не перебегайте дорогу вблизи перекрестков!");

                case "Х":
                System.out.println("Не перебегайте дорогу вблизи остановок общественного транспорта!");

                default:
                    isSafePlace = true;

            }
        }

        if(isTrafficLightGreen) {
            System.out.println("Вы можете перейти дорогу!");
            System.out.println("Сколько полос движения на дороге?");
            int linesCount = scanner.nextInt();
            if(linesCount < 1 && linesCount > 0){
                System.out.println("Посмотрите в обе стороны и переходите.");
            } else {
                int halfWay = linesCount % 2;
                for(int line = 1; line < halfWay; line++){
                    if(line == halfWay){
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