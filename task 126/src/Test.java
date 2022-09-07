public class Test {

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