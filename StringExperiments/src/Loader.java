
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String str = text.trim();
        String digits = "";
        int sum = 0;
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);
            if (Character.isDigit(chrs))
                digits += chrs;
            else {
                if (!digits.equals(""))
                    sum += Integer.parseInt(digits);
                digits = "";
            }

        }
        System.out.println(sum);
    }
}