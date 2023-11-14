package packagea;

public class Salmon {
int count;
{ System.out.print(count+"-");
    }
4: { count++; }
5: public Salmon() {
        6: count = 4;
        7: System.out.print(2+"-");
        8: }
9: public static void main(String[] args) {
        10: System.out.print(7+"-");
        11: var s = new Salmon();
        12: System.out.print(s.count+"-");
    } }