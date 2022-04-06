import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        String first = Long.toString(a);
        String snd = Long.toString(b);
        int lngt1 = first.length();
        int lngth2 = snd.length();
        boolean otv = false;
        for (int i = 0; i < Math.min(lngt1, lngth2); i++) {
            int num1 = first.charAt(lngt1 - 1 - i) - '0';
            int num2 = snd.charAt(lngth2 - 1 - i) - '0';
            if (num1 + num2 >= 10) {
                otv = true;
                break;
            }
        }
        if (otv) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
