public class Test {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);
        final Item[] items = {item1, item2, item3}; // Рюкзак.
    }
}

class Item{
    private int weigth;
    private int value;

    Item(int weigth, int value) {
        this.weigth = weigth;
        this.value = value;
    }

    public double valuePerUnitOfWheight(){
        return value / (double) weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getValue() {
        return value;
    }
    public String toString(){
        return "{w: " + weigth + "v: " + value + "}";
    }
}