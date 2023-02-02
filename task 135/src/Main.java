
public class Main {
    public static void main(String[] args) {
         double x = Math.random();
         int k = (int) Math.round(x * 10);
         int [] nubmers = new int[10];
         for (int i = 0; i<nubmers.length; i++){
             nubmers[i]= k+1;
             System.out.println(nubmers[k]);
         }
        System.out.println(nubmers[0]);
    }
}