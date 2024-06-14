import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //мы подготовили эти прайс-лист
            String[] items1913 = {"Корова", "Курица", "Рубашка", "Шапка гусарская", "Гармонь", "Рояль"};
            String[] items1984 = {"Банка сгущёнки", "Мороженое", "Карта мира", "Кассетный магнитофон", "Пальто осеннее"};

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму в современных рублях:");
            int amount = scanner.nextInt();

            System.out.println("Введите год (1913 или 1984)");
            int year = scanner.nextInt();

            // это коэффициент для перевода рубля по курсу заданного года
            double koef = -1;

            switch (year) {

            }

            // курс рубля задан не для каждого года
            if(koef < 0){
                System.out.println("Для этого года у нас нет данных.");
                koef = 0;
            }

            // переведите заданную сумму в рубли по старому курсу
            double amountByYear = amount * koef;

            System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                    + amountByYear + " р. "
                    + "На эти деньги вы могли бы купить следующие товары:");

            // выведите товары, которые вам доступны
            switch (year) {
                case 1913:
                    for (int i = 0; i < items1913.length; i++) {
                        String item = items1913[i];
                        Double price = 0.0;
                        switch (item){
	                     ...
                        }
                        // расчитываем количество и приводим результат к целому числу
                        int quantity = (int) (amountByYear / price);
                        if(quantity > 0) {
                            System.out.println(item + " — " + quantity + " шт.");
                        }
                    }

                    break;
                case 1984:
                    for (int i = 0; i < items1984.length; i++) {
                        String item = items1984[i];
                        Double price = 0.0;
                        switch (item){
											...
                        }
                        // расчитываем количество и приводим результат к целому числу
                        int quantity = (int) (amountByYear / price);
                        if(quantity > 0) {
                            System.out.println(item + " — " + quantity + " шт.");
                        }
                    }
                    break;
            }
        }

    }