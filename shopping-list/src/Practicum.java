public class Practicum {

    public static void main(String[] args) {

        int balls; // сохраните общее число мячиков Пикселя в переменной balls
        System.out.println("У Пикселя " + balls + " мячиков");

		playPixel(); // поиграйте с Пикселем, вызвав метод playPixel

        // после игры Пиксель должен вернуть все мячики на место!
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + ...);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков спрятал Пиксель?");
        ... // сохраните количество мячиков, которые спрятал Пиксель, в переменную hiddenBalls

        balls = ... // посчитайте, сколько у Пикселя осталось мячиков
        System.out.println("Осталось " + ... );
    }
}