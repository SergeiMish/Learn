
 public class Main {
     public static void main(String[] args) {
         int megabytes = 64000;
         int gigabytes = 64;
         int megabytesPerGigabyte = megabytes / 1024;
         int gigabytesToMegabytes = megabytesPerGigabyte;
         boolean isMbMore = gigabytesToMegabytes >= gigabytes;
         System.out.println(isMbMore);
     }
 }
