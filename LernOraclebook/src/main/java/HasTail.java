public interface HasTail {
    private int getTailLength();
}

abstract class Puma implements Main.HasTail {
    String getTailLength() {
        return "4";
    }
}

public class Cougar implements Main.HasTail {
    public static void main(String[] args) {
        var puma = new Main.Puma() { };
        System.out.println(puma.getTailLength());
    }
    public int getTailLength(int length) {
        return 2;
    }
}
}
