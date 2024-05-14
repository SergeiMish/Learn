import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            System.out.println("Круг " + i);
            if (i == 1){
                System.out.println("Отжимаемся");
            }
            else if (i == 2){
                System.out.println("Качаем пресс");
            }
            else if (i == 3){
                System.out.println("Отжимаемся");
            }
            else if (i == 4){
                System.out.println("Качаем пресс");
            }
            else if (i == 5){
                System.out.println("Отжимаемся");
            }
            System.out.println("Бегаем в колесе");
        }

        // в тренировке должно выполниться 5 кругов — напишите здесь цикл


        // выполнение каждого круга зависит от условия — проверьте, является ли круг чётным
        // если да, то нужно качать пресс


        // иначе нужно отжаться


        // независимо от номера круга бегаем в колесе


        System.out.println("Отлично позанимались сегодня! Вы молодец!");
    }
}