import java.util.Arrays;

public class Main {
interface HasTail { private int getTailLength(); }
abstract class Puma implements HasTail {
String getTailLength() { return "4"; }
}
5: public class Cougar implements HasTail {
6: public static void main(String[] args) {
               7: var puma = new Puma() {};
               Assessment Test xlix
               8: System.out.println(puma.getTailLength());
               9: }
10: public int getTailLength(int length) { return 2; }
11: }