package packagea;

public class Bear {
private Bear pandaBear;
private void roar(Bear b) {
         System.out.println("Roar!");
         pandaBear = b;
         }
 public static void main(String[] args) {
        Bear brownBear = new Bear();
        10: Bear polarBear = new Bear();
        11: brownBear.roar(polarBear);
        12: polarBear = null;
        13: brownBear = null;
        14: System.gc(); } }